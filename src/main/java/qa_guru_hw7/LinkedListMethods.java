package qa_guru_hw7;

import java.util.LinkedList;

public class LinkedListMethods {
    LinkedList<String> phone = new LinkedList<String>();

    public void addPhoneList(String str) {
        phone.addFirst(str);
    }

    public void addLastPhoneList(String str) {
        phone.addLast(str);
    }

    public void addPhoneIndex(int i, String str) {
        phone.add(i, str);
    }

    public void volumePhone(String str) {
        System.out.println("Телефонов в списке: " + phone.contains(str));
    }

    public void removePhone(String str) {
        phone.remove(str);
    }

    public void modelPhone() {
        for (int i = 0; i < phone.size(); i++) {
            System.out.println("Модель телефона : " + phone.get(i));
        }
    }

    public void seeFirstPhoneByList() {
        System.out.println("Первый телофон в списке: " + phone.getFirst());
    }

    public void seeLastPhoneByList() {
        System.out.println("Последний телофон в списке : " + phone.getLast());
    }

    public void clearList() {
        phone.clear();
    }

    public boolean phoneIsEmpty() {
        phone.isEmpty();
        return false;
    }

    public void checkClearList(boolean phonelist) {
        if (phone.isEmpty() == true) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список не пуст");
        }
    }
}