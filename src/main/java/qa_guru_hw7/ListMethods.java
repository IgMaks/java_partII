package qa_guru_hw7;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    List<String> phone = new ArrayList<>();

    public void addElementList(String str) {
        phone.add(str);
    }

    public void checkAddedPhone() {
        for (String element : phone) {
            System.out.println(element);
        }
    }

    public void addPhoneByIndex(int index, String str) {
        phone.add(index, str);
    }

    public String findPhoneByIndex(int index) {
        return phone.get(index);
    }

    public int seeIndexNewPhone(String str) {
        return phone.indexOf(str);

    }

    public String getPhone(int i) {
        return phone.get(i);
    }

    public void removePhone(String str) {
        phone.remove(str);
    }

    public void checkRemove(String str) {
        if (phone.contains(str) == false) {
            System.out.println("Phone is delete");
        } else {
            System.out.println("Phone is not delete");
        }
    }

    public void changeTitlePhone(String str, int index) {
        phone.set(index, str);
    }

    public void checkTitleChange(int index) {
        System.out.println("Phone name changed : " + phone.get(index));
    }

    public void clear() {
        phone.clear();
    }

    public boolean phoneIsEmpty() {
        phone.isEmpty();
        return false;
    }

    public void checkClearArray(boolean phoneWatched) {
        if (phone.isEmpty() == true) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список не пуст");
        }
    }

}