package menu.Model;

import menu.enums.MenuCategories;

import java.util.List;

public class MenuFinder {
    public boolean findMenu(String menu) {
        MenuCategories[] categories = MenuCategories.values();//일식, 한식, 중식 ...
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i]);
            if(menuContains(categories[i], menu)) {
                return true;
            }
        }
        return false;
    }

    private boolean menuContains(MenuCategories menuCategories, String menu) {
        List<String> menus = menuCategories.getCategory();
        return menus.contains(menuContainsBlank(menu));
    }

    private String menuContainsBlank(String menu) {
        if (!menu.contains(" ")) {
            return menu;
        }
        menu = menu.replace(" ", "_");
        return menu;
    }

}
