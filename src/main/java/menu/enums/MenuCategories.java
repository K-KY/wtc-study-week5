package menu.enums;

import java.util.ArrayList;

//1이면 일식, 2면 한식, 3이면 중식, 4면 아시안, 5면 양식을 추천해야 한다.
public enum MenuCategories {
    일식(Japan.values()),
    한식(Korea.values()),
    중식(China.values()),
    아시안(Asian.values()),
    양식(Northern.values());
    private final Enum<?>[] category;
    MenuCategories(Enum<?>[] category) {
        this.category = category;
    }

    public ArrayList<String> getCategory() {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < category.length; i++) {
            arr.add(category[i].toString());
        }
        return arr;
    }


}
