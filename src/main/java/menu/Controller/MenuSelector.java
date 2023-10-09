package menu.Controller;

import menu.Model.Member.GenerateMember;
import menu.Model.Member.Member;
import menu.Model.menurecommend.CategorySelector;
import menu.Model.validator.InputValidator;
import menu.View.InputMemberDislike;
import menu.View.InputMembers;
import menu.View.ResultOutput;
import menu.enums.MenuCategories;
import menu.enums.Week;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MenuSelector {
    public void start() {
        InputMembers inputMembers = new InputMembers();
        ArrayList<String> members = inputMembers.inputMembers(new InputValidator());
        LinkedHashMap<String, Member> memberMap = generateMember(members);
        menuSelect(memberMap);
        menuResult(memberMap);
    }

    //객체 생성
    private LinkedHashMap<String, Member> generateMember(ArrayList<String> members) {
        GenerateMember generateMember = new GenerateMember();
        LinkedHashMap<String, Member> memberMap = new LinkedHashMap<>();
        for (int i = 0; i < members.size(); i++) {
            List<String> dislikeList = inputMemberDislike(members.get(i));
            memberMap.put(members.get(i), generateMember.generateMember(dislikeList));
        }
        return memberMap;
    }

    //못먹는 음식
    private List<String> inputMemberDislike(String member) {
        InputMemberDislike memberDislike = new InputMemberDislike();
        return new ArrayList<>(memberDislike.memberDislike(new InputValidator(), member));
    }

    private void menuSelect(LinkedHashMap<String, Member> memberMap) {
        ArrayList<MenuCategories> arr = new ArrayList<>(CategorySelector.getInstance());
        for (int i = 1; i < Week.length(); i++) {
            List<String> menu = getNextMenu(arr);
            memberMap.forEach((k, v) -> {
                v.addMenu(menu);
            });
        }
    }
    private List<String> getNextMenu(ArrayList<MenuCategories> menuCategories) {
        MenuCategories nextCategory = menuCategories.remove(0);
        return nextCategory.getMenus();
    }

    private void menuResult(LinkedHashMap<String, Member> memberMap) {
        ResultOutput resultOutput = new ResultOutput();
        resultOutput.printResult(memberMap);
    }

}
