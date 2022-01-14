package Homework3.MarinaPattern.Singleton;

public class Main {

    public static void main(String[] args) {

        final int SIZE = 1000;
        Singleton arr[] = new Singleton[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
    }
}
