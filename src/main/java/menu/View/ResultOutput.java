package menu.View;

import menu.Model.DataFormat;
import menu.Model.Member.Member;
import menu.Model.menurecommend.CategorySelector;
import menu.enums.Week;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class ResultOutput {
    public void printResult(LinkedHashMap<String, Member> memberMap) {
        new SystemOutput().printResult();
        System.out.println(new DataFormat().dataFormChanger(Arrays.toString(Week.values())));
        System.out.println(new DataFormat().dataFormChanger(Arrays.toString(CategorySelector.getInstance().toArray())).replace("[" , "[ 카테고리 |"));
        memberMap.forEach((k, v) -> {
            System.out.println(new DataFormat().dataFormChanger(v.getRecommendedMenu().toString()).replace("[", "[ " + k + " |"));
        });
        new SystemOutput().printComplete();
    }
}
