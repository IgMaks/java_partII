package qa_guru_hw7;

import java.util.Set;

public class SetMethods {
    private static Set<String> carsSet;

    public static void addElement(Set<String> carsSet, String nameElement) {

        carsSet.add(nameElement);
    }

    public static String getElement(Set<String> carsSet, String nameElement) {
        for (String element:carsSet) {
            if (element.equals(nameElement)) return element;
        }
        return "Элемент отсутсвует";
    }

    public static void removeElement(Set<String> carsSet, String nameElement) {
        carsSet.remove(nameElement);
    }

}
