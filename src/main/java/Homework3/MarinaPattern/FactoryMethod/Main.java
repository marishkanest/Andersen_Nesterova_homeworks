package Homework3.MarinaPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        WatchMaker maker= new DigitalWatchMaker();
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}
