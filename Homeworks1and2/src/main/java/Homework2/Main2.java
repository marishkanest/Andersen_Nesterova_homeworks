package Homework2;

public class Main2 {
    public static void main(String[] args) {
        MyLinkedList <Integer> list = new MyLinkedListImpl<>();
        list.add(8);
        list.add(15);
        list.add(17);
        list.add(25);
        list.add(1);
        list.add(10);


        list.remove(8);
        list.remove ( 17);
        list.remove ( 10);

        System.out.println(list.size());
    }
}
