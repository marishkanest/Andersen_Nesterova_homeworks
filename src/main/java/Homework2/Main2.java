package Homework2;

public class Main2 {
    public static void main(String[] args) {
        MyLinkedListImpl <Integer> list = new MyLinkedListImpl<>();
        list.add(999);
        list.add(8);
        list.add(15);
        list.add(17);
        list.add(25);
        list.add(1);
        list.add(10);
        list.add(500);
        list.add(3);

        System.out.println("До сортировки: " + list.toString());
        list.sort();
        System.out.println("После сортировки: " + list.toString());

        list.remove(8);
        list.remove ( 17);
        list.remove ( 10);

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.toString());

    }
}