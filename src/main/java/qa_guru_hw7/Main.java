package qa_guru_hw7;

public class Main {
    public static void main(String[] args) {
        // создадим список
        System.out.println("Список телефонов");
        LinkedListMethods linkedListMethods = new LinkedListMethods();
        linkedListMethods.addPhoneList("Apple");
        linkedListMethods.addPhoneList("Samsung");
        linkedListMethods.addLastPhoneList("Nokia");
        linkedListMethods.addPhoneList("Alcatel");
        linkedListMethods.seeFirstPhoneByList();
        linkedListMethods.seeLastPhoneByList();
        linkedListMethods.modelPhone();
        linkedListMethods.addPhoneIndex(4, "Pixel");
        linkedListMethods.volumePhone("Pixel");
        linkedListMethods.removePhone("Alcatel");
        linkedListMethods.modelPhone();
        linkedListMethods.clearList();
        linkedListMethods.phoneIsEmpty();
        boolean phoneList = linkedListMethods.phoneIsEmpty();
        linkedListMethods.checkClearList(phoneList);
        System.out.println("------------------------");

        // создаем set

        SetMethods cars = new SetMethods();
        cars.add("BMW x3");
        cars.add("Lada Vesta");
        cars.add("logan");
        cars.showAllElement();
        cars.removeCars("Lada Vesta");
        cars.checkCarsRemove("lada Vesta");
        cars.showAllElement();
        cars.clearCars();
        cars.checkCloseDiler();
        System.out.println("------------------------");
        System.out.println("   ");

        // создаем map
        MapMethods phoneModel = new MapMethods();
        System.out.println("Отчет склада магазина сотовой связи");
        phoneModel.addModelPhone("iPhone", 12);
        phoneModel.addModelPhone("Samsung", 5);
        phoneModel.addModelPhone("Nokia", 3310);
        phoneModel.printAllModelPhone();
        phoneModel.getModelPhone("iPhone");
        phoneModel.salePhone("iPhone");
        phoneModel.printAllModelPhone();
        phoneModel.clearList();
        phoneModel.phoneIsEmpty();
        System.out.println("------------------------");
        System.out.println("   ");

        // создаем List
        ListMethods phone = new ListMethods();
        System.out.println("Добавляем в список телефоны");
        phone.addElementList("Apple");
        phone.addElementList("Honor");
        phone.addElementList("Pixel");
        phone.checkAddedPhone();
        phone.addPhoneByIndex(2, "OPPO");
        System.out.println("Новый элемент: " + phone.findPhoneByIndex(2));
        phone.checkAddedPhone();
        System.out.println("Поиск индекса по наименованию " + phone.seeIndexNewPhone("OPPO"));
        String phoneIsRemove = phone.getPhone(1);
        phone.removePhone(phoneIsRemove);
        phone.checkRemove(phoneIsRemove);
        phone.changeTitlePhone("MiZU", 1);
        phone.checkTitleChange(1);
        phone.checkAddedPhone();
        phone.clear();
        boolean phoneWatched = phone.phoneIsEmpty();
        phone.checkClearArray(phoneWatched);


    }

}