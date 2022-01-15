package Homework3.MarinaPattern.Decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;


    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+ ",Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}

