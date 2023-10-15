package menu.Model.menurecommend;

import camp.nextstep.edu.missionutils.Randoms;
import menu.enums.MenuCategories;
import menu.enums.Week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategorySelector {
    List<MenuCategories> category = new ArrayList<>();

    private CategorySelector() {
        select();
    }

    private static class generateMenuSelector {
        private static final CategorySelector selector = new CategorySelector();
    }

    public static List<MenuCategories> getInstance() {
        return generateMenuSelector.selector.category;
    }


    private void select() {
        List<MenuCategories> categories = Arrays.asList(MenuCategories.values());//[일식, 한식, 중식, 아시안, 양식]
        for (int i = 1; i < Week.values().length; ) {
            MenuCategories menuCategories = categories.get(Randoms.pickNumberInRange(1, 5) - 1);
            int duple = (int)category.stream().filter(m -> m.toString().equals(menuCategories.toString())).count();
            if (duple < 2) {
                i++;
                category.add(menuCategories);
            }
        }
    }

}
