package Homework2;

public class MyLinkedListImpl<T> implements MyLinkedList<T> {

    private static class Node {


        Object value;
        Node next;

        public <T> Node(Object value) {
            this.value =  value;
        }
    }

    private Node first;
    private Node last;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T t) {
        Node newNode = new Node(t);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public void remove(T t) {
        for (Node current = first, prev = null; current != null; prev = current, current = current.next) {
            if (current.value == t) {
                if (current == first) {
                    first = current.next;
                    current.next = null;
                } else if (current == last) {
                    prev.next = null;
                    last = prev;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
        }
    }

    @Override
    public void sort() {

    }
}
