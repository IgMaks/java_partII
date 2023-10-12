package qa_guru_hw7;

import java.util.HashSet;
import java.util.Iterator;

public class SetMethods {
    HashSet<String> cars = new HashSet<>();

    public void add(String str) {
        cars.add(str);
    }

    public void showAllElement() {
        Iterator<String> i = cars.iterator();
        while (i.hasNext())
            System.out.println("В салоне " + i.next());
    }

    public void removeCars(String str) {
        cars.remove(str);
        System.out.println("Остались" + cars);
    }

    public void checkCarsRemove(String str) {
        if (cars.contains(str) == false) {
            System.out.println("Vesta Продана" + cars);
        } else {
            System.out.println("Продается" + cars);
        }
    }


    public void clearCars() {
        cars.clear();
    }

    public void checkCloseDiler() {
        if (cars.isEmpty() == true) {
            System.out.println("Салон закрыт");
        } else {
            System.out.println("Еще кое что есть");
        }
    }

}