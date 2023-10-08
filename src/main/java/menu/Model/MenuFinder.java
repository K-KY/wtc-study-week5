package menu.Model;

import menu.enums.MenuCategories;

import java.util.List;

public class MenuFinder {
    public void findMenu(String menu) {
        MenuCategories[] categories = MenuCategories.values();//일식, 한식, 중식 ...
        for (int i = 0; i < categories.length; i++) {
            if(menuContains(categories[i], menu)) {
                return;
            }
        }
        throw new IllegalArgumentException("[ERROR] 존재하지 않는 메뉴입니다.");
    }

    private boolean menuContains(MenuCategories menuCategories, String menu) {
        List<String> menus = menuCategories.getMenus();
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
