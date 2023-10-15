package menu;

import menu.Controller.MenuSelector;
import menu.View.SystemOutput;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        SystemOutput systemOutput = new SystemOutput();
        systemOutput.printStartMessage();
        MenuSelector menuSelector = new MenuSelector();
        menuSelector.start();
    }
}
