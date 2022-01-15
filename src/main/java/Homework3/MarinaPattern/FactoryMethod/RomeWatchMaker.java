package Homework3.MarinaPattern.FactoryMethod;

public class RomeWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
