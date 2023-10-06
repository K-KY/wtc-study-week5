package menu.enums;
//1이면 일식, 2면 한식, 3이면 중식, 4면 아시안, 5면 양식을 추천해야 한다.
public enum MenuCategory {
    일식("일식"), 한식("한식"), 중식("중식"), 아시안("아시안"), 양식("양식");

    private final String category;

    MenuCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
