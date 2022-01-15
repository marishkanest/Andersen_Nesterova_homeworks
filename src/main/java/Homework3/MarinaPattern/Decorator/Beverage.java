package Homework3.MarinaPattern.Decorator;

public abstract class Beverage {
    String description = "Unknoun Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
