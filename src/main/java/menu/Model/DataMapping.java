package menu.Model;

import java.util.ArrayList;

public class DataMapping {
    public ArrayList<String> StringToList(String input) {
        String[] divide = input.split(",");
        ArrayList<String> mapped = new ArrayList<>();
        for (int i = 0; i < divide.length; i++) {
            mapped.add(divide[i].trim());
        }
        return mapped;
    }
}
