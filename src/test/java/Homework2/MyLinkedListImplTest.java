package Homework2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyLinkedListImplTest {

    @Test
    public void size() {
        MyLinkedList <Integer> myList = new MyLinkedListImpl<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        Object actual = myList.size();
        Object expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void add() {
        MyLinkedList <Integer> myList = new MyLinkedListImpl<>();
        myList.add(5);

        Object actual = myList.get(0);
        Object expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        MyLinkedList <Integer> myList = new MyLinkedListImpl<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        myList.remove(2);

        Object [] arrActual = new Object[myList.size()];
        for(int i=0; i<arrActual.length; i++){
            arrActual[i]=myList.get(i);
        }
        Object [] arrExpected= {1,3};
        Object actual = Arrays.toString(arrActual);
        Object expected = Arrays.toString(arrExpected);
        assertEquals(expected,actual);
    }

    @Test
    public void get() {
        MyLinkedList <Integer> myList = new MyLinkedListImpl<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        Object actual = myList.get(1);
        Object expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        MyLinkedList <Integer> myList = new MyLinkedListImpl<>();
        myList.add(5);
        myList.add(6);
        myList.add(8);
        myList.add(10);

        Object [] arrExpected= {5,6,8,10};
        Object actual = myList.toString();
        Object expected = Arrays.toString(arrExpected);
        assertEquals(expected,actual);
    }

    @Test
    public void sort() {
        MyLinkedList <Integer> myList = new MyLinkedListImpl<>();
        myList.add(9);
        myList.add(6);
        myList.add(8);
        myList.add(1);

        myList.sort();

        Object [] arrExpected= {1,6,8,9};
        Object actual = myList.toString();
        Object expected = Arrays.toString(arrExpected);
        assertEquals(expected,actual);
    }
}