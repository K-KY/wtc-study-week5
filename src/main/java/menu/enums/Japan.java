package menu.enums;

public enum Japan {
    규동("규동"), 우동("우동"), 미소시루("미소시루"), 스시("스시"), 가츠동("가츠동"), 오니기리("오니기리"), 하이라이스("하이라이스"), 라멘("라멘"), 오코노미야끼("오코노미야끼");
    private final String menu;

    Japan(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}
