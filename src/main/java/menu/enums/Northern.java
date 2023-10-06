package menu.enums;

public enum Northern {
    라자냐("라자냐"), 그라탱("그라탱"), 뇨끼("뇨끼"), 끼슈("끼슈"), 프렌치토스트("프렌치 토스트"), 바게트("바게트"), 스파게티("스파게티"), 피자("피자"), 파니니("파니니");

    private final String menu;

    Northern(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}
