package Homework1;

public interface MyArrayList<T> {

    void add(T t);

    T get(int index);

    T set(int index, T t);

    void removeByIndex(int index);

    void remove(T t);

    int size();

    void sort();
}
