package menu.Model;

public class DataFormat {
    public String dataFormChanger(String str) {
        str = str.replace("_", " ");
        str = str.replace(", ", " | ");
        str = str.replace("[", "[ ");
        str = str.replace("]", " ]");
        return str;
    }
}
