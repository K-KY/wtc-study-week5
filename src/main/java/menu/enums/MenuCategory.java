package menu.enums;

import java.util.Arrays;
import java.util.List;

//1이면 일식, 2면 한식, 3이면 중식, 4면 아시안, 5면 양식을 추천해야 한다.
public enum MenuCategory {
    일식(Japan.values()),
    한식(Korea.values()),
    중식(China.values()),
    아시안(Asian.values()),
    양식(Northern.values());
    private final Enum[] category;
    MenuCategory(Enum[] category) {
        this.category = category;
    }

    public List<Enum> getCategory() {
        return Arrays.asList(category);
    }
}
