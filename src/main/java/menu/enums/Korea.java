package menu.enums;

public enum Korea {
    김밥("김밥"), 김치찌개("김치찌개"), 쌈밥("쌈밥"), 된장찌개("된장찌개"), 비빔밥("비빔밥"), 칼국수("칼국수"), 불고기("불고기"), 떡볶이("떡볶이"), 제육볶음("제육볶음");

    private final String menu;

    Korea(String menu) {
        this.menu = menu;
    }
    public String getMenu() {
        return menu;
    }

}
