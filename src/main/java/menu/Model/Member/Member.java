package menu.Model.Member;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Member {
    List<String> memberDislike;
    List<String> recommendedMenu = new ArrayList<>();

    public Member(List<String> memberDislike) {
        this.memberDislike = memberDislike;
    }

    public void addMenu(List<String> menu) {
        while(hasEqualMenu(menu.get(0)) && hasDislike(menu.get(0))) {
            menu = Randoms.shuffle(menu);
        }
            recommendedMenu.add(menu.get(0));
    }

    private boolean hasEqualMenu(String menu) {
        return recommendedMenu.contains(menu);
    }

    private boolean hasDislike(String menu) {
        return memberDislike.contains(menu);
    }

    public List<String> getRecommendedMenu() {
        return recommendedMenu;
    }
}
