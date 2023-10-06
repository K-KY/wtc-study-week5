package menu;

import menu.enums.MenuCategory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
public class EnumTest {
    @Test
    void 메뉴를_출력한다() {
        List<MenuCategory> list = Arrays.asList(MenuCategory.values());
        for (int i = 1; i <= list.size(); i++) {
            System.out.println(list.get(i - 1).getCategory());
        }
    }

    @Test
    void 카테고리를_출력한다() {
        List<MenuCategory> list = Arrays.asList(MenuCategory.values());
        System.out.println(list);
    }
}
