package qa_guru_hw7;

import java.util.*;
import static qa_guru_hw7.LinkedListMethods.*;
import static qa_guru_hw7.ListMethods.*;
import static qa_guru_hw7.MapMethods.*;
import static qa_guru_hw7.SetMethods.*;

public class Main {
    public static void main(String[] args) {
        // создадим список
        LinkedList<Object> linkedList = new LinkedList<>();
        System.out.println("Добавляем в список");
        addElementInLinkedList(linkedList, "Apple");
        addElementInLinkedList(linkedList, "Samsung");
        addElementInLinkedList(linkedList, "Nokia");
        System.out.println(linkedList);
        System.out.println("********");
        System.out.println("Поиск элемента в массиве");
        System.out.println(getElementLinkedList(linkedList, "Apple"));
        System.out.println("********");
        System.out.println("Удадение элементв и вывод массива");
        removeElementLinkedList(linkedList,"Samsung");
        System.out.println(linkedList);
        System.out.println("------------------------");

        // создаем set
        HashSet<String> carsSet = new HashSet<>();
        addElement(carsSet, "BMW");
        addElement(carsSet, "Lada");
        System.out.println("Добвалено в список set" + carsSet);
        System.out.println("********");
        System.out.println("Результат поиска: " + getElement( carsSet, "BMW"));
        System.out.println("Результат поиска: " + getElement( carsSet, "Porshe"));
        System.out.println("********");
        removeElement(carsSet, "BMW");
        System.out.println("В списке только " + carsSet);
        System.out.println("------------------------");
        System.out.println("   ");
        // создаем map
        HashMap<Object, Object> stringMap = new HashMap<>();
        System.out.println("Добавляем в список map");
        addElementInMap(stringMap, "Apple", "XR");
        addElementInMap(stringMap, "Samsung", "s5");
        System.out.println(stringMap);
        System.out.println("Поиск элемента в массиве");
        System.out.println(getEntry(stringMap, "Apple"));
        System.out.println(getEntry(stringMap,"Nokia"));
        System.out.println("Удадение элементв и вывод массива");
        removeElementByKey(stringMap, "Samsung");
        System.out.println(stringMap);
        System.out.println("------------------------");
        System.out.println("   ");
        // создаем List
        ArrayList<String> strList = new ArrayList<String>();
        System.out.println("Добавляем в список List");
        strList = new ArrayList<String>();
        addElementList(strList, "Apple");
        addElementList(strList, "Honor");
        addElementList(strList, "Pixel");
        System.out.println(strList);
        System.out.println("Поиск элемента в массиве");
        System.out.println("Результат поиска: " + getElementList(strList, "Pixel"));
        System.out.println("Результат поиска: " + getElementList(strList, "Pixel1"));
        System.out.println("Удадение элементв и вывод массива");
        removeElementList(strList, "Honor");
        System.out.println(strList);
    }

}
