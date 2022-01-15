package Homework3.MarinaPattern.FactoryMethod;

public class DigitalWatchMaker implements WatchMaker {
    public Watch createWatch(){
        return  new DigitalWatch();
    }
}
