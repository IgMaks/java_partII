package qa_guru_hw7;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    private static List<String> linkedList;

    public static void addElementInLinkedList(LinkedList<Object> linkedList, String element) {
        linkedList.add(element);
    }
    static String getElementLinkedList(LinkedList<Object> linkedList, String nameElement) {
        for (Object element:linkedList) {
            if (element.equals(nameElement));
            return (String) element;
        }
        return "Не найдено";
    }

    static void removeElementLinkedList(LinkedList<Object> linkedList, String elementName) {
        linkedList.remove(elementName);
    }


}
