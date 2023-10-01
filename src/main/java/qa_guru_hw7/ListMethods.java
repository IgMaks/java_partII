package qa_guru_hw7;

import java.util.List;

public class ListMethods {
    private static List<String> strList;

    public static String getElementList(List<String> strList, String nameElement) {
        for (String element:
             strList) {
            if (element.equals(nameElement)) return element;
        }
        return "No found";
    }

    public static void addElementList(List<String> strList, String nameElement) {
        strList.add(nameElement);
    }

    public static void removeElementList(List<String> strList, String nameElement) {
        strList.remove(nameElement);
    }

}
