package Homework1;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MyArrayListImplTest {
    @Test
    public void size() {
        MyArrayList <Integer> myList = new MyArrayListImpl<>();
        myList.add(5);
        myList.add(6);

        int actual = myList.size();
        int expected = 2;
        assertEquals(expected,actual);
    }
}
