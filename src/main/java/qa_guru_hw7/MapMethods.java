package qa_guru_hw7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMethods {

    HashMap<String, Integer> phoneModel = new HashMap<>();

    public void addModelPhone(String str, Integer i) {
        phoneModel.put(str, i);
    }

    public void getModelPhone(String str) {
        System.out.println("В наличии только iPhone " + phoneModel.get(str));
    }

    public void printAllModelPhone() {
        Iterator<Map.Entry<String, Integer>> iterator = phoneModel.entrySet().iterator();
        do {
            Map.Entry<String, Integer> entry = iterator.next();
            String brandTitle = entry.getKey();
            Integer model = entry.getValue();
            System.out.println(brandTitle + " " + model);
        } while (iterator.hasNext());
    }

    public void salePhone(String str) {
        phoneModel.remove(str);
    }

    public void clearList() {
        phoneModel.clear();
    }

    public void phoneIsEmpty() {
        if (phoneModel.isEmpty() == true) {
            System.out.println("Склад пуст");
        } else {
            System.out.println("Что то есть");
        }
    }


}