package Homework1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyArrayListImplTest {

    @Test
    public void add() {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();
        myList.add(5);

        int actual = myList.get(0);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    public void get() {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        int actual = myList.get(2);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void set() {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();
        myList.add(5);
        myList.add(6);
        myList.set(1,7);

        int actual = myList.get(1);
        int expected = 7;
        assertEquals(expected,actual);
    }

    @Test
    public void removeByIndex() {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.removeByIndex(1);

        int actual = myList.get(1);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.remove(3);

        int actual = myList.get(2);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void size() {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();
        myList.add(5);
        myList.add(6);

        int actual = myList.size();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void sort() {
        MyArrayList<Integer> myList = new MyArrayListImpl<>();
        myList.add(5);
        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(4);

        myList.sort();
        int [] arrActual = new int[5];
        for(int i=0; i<arrActual.length; i++){
            arrActual[i]=myList.get(i);
        }
        int [] arrExpected= {1,2,3,4,5};
        Object actual = Arrays.toString(arrActual);
        Object expected = Arrays.toString(arrExpected);
        assertEquals(expected,actual);
    }
}