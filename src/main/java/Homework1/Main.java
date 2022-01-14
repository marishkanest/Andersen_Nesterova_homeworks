package Homework1;

public class Main {
    public static void main(String[] args) {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();

        for (int i = 0; i < 15; i++)
            myList.add(i*5);

        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));

        System.out.println("В массиве хранится: " + myList.size() + " элементов");
        System.out.println();

        myList.remove(65);
        myList.removeByIndex(2);
        myList.set(5, 888);
        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));

        System.out.println("В массиве хранится: " + myList.size() + " элементов");

        System.out.println("________________________________________________");

        MyArrayList <Integer> myList1 = new  MyArrayListImpl<>();

        myList1.add(543);
        myList1.add(-25);
        myList1.add(124);
        myList1.add(13);
        myList1.add(0);
        myList1.add(13);
        myList1.add(5);
        myList1.add(120);
        myList1.add(14);
        myList1.add(1);

        System.out.print("Массив до сортировки: ");
        for (int i = 0; i < myList1.size(); i++)
            System.out.print(myList1.get(i) + " ");

        myList1.sort();

        System.out.println();
        System.out.print("Массив после сортировки: ");
        for (int i = 0; i < myList1.size(); i++)
            System.out.print(myList1.get(i) + " ");
        System.out.println();

        System.out.println("________________________________________________");

        User user0 = new User(40L, "Марсель", "Сидиков", 28, 1.85);
        User user1 = new User(7L, "Алия", "Мухутдинова", 21, 1.73);
        User user2 = new User(13L, "Виктор", "Евлампьев", 24, 1.78);
        User user3 = new User(44L, "Айрат", "Мухутдинов", 22, 1.85);
        User user4 = new User(1L, "Даниил", "Вдовинов", 21, 1.75);
        User user5 = new User(15L, "Максим", "Поздеев", 22, 1.68);
        User user6 = new User(9L, "Салават", "Забиров", 25, 1.73);
        User user7 = new User(2L, "Ильгам", "Хасанов", 24, 1.80);


        MyArrayList <User> users = new MyArrayListImpl<>();
        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);


        users.sort();

        System.out.println();
        System.out.println("Отсортированный по возрасту список пользователей: ");
        for (int i = 0; i < users.size(); i++)
            System.out.println(users.get(i) + " ");
        System.out.println();

        System.out.println("________________________________________________");


    }
}
