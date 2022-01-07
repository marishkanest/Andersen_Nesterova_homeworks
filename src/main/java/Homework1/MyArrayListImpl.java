package Homework1;

public class MyArrayListImpl<T extends Comparable<T>> implements MyArrayList<T> {


    private static final int DEFAULT_SIZE = 10;// размер массива по умолчанию

    private Object[] elements; // объявление переменной массива

    private int size; // счетчик заполнения массива


    public MyArrayListImpl() {
        this.elements = new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    // Метод, добавляющий новый элемент в конец массива
    @Override
    public void add(T t) {
        if (size == elements.length) {
            resize();
        }
        this.elements[size] = t;
        size++;
    }

    // Метод, увеличивающий емкость массива в 1.5 раза
    private void resize() {
        Object[] newElements = new Object[elements.length + elements.length / 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }

    // Метод, возвращающий значение элемента по индексу в массиве
    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) elements[index];
        } else {
            throw new RuntimeException("Out of bounds");
        }
    }

    // Метод, заменяющий элемент в массиве по заданному индексу и новому значению
    @Override
    public T set(int index, T t) {
        if (index >= 0 && index < size) {
            T oldValue = (T) elements[index];
            elements[index] = t;
            return oldValue;
        } else {
            throw new RuntimeException("Out of bounds");
        }
    }
    // Метод,удаляющий элемент по индексу
    @Override
    public void removeByIndex(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            size--;
        }
    }

    // Метод,удаляющий элемент
    @Override
    public void remove(T t) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == t) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                break;
            }
        }
        size--;
    }
    // Метод, возвращающий количество хранящихся элементов
    @Override
    public int size() {
        return size;
    }

    // Метод, реализующий  сортировку пузырьком
    @Override
    public  void sort() {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (((T)(elements[j])).compareTo((T)(elements[j + 1])) > 0) {
                    T temp = (T) elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }
}


