package menu.enums;

public enum China {
    깐풍기("깐풍기"), 볶음면("볶음면"), 동파육("동파육"), 짜장면("짜장면"), 짬뽕("짬뽕"), 마파두부("마파두부"), 탕수육("탕수육"), 토마토달걀볶음("토마토달걀볶음"), 고추잡채("고추잡채");

    private final String menu;

    China(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}
