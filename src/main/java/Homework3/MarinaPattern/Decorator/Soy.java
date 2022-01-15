package Homework3.MarinaPattern.Decorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+ ",Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}


