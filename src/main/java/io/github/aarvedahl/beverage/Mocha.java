package io.github.aarvedahl.beverage;

public class Mocha extends Decorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double ingredientsPrice() {
        return beverage.ingredientsPrice() + 1.99;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 5;
    }

    @Override
    public int getMinutesToMake() {
        return beverage.getMinutesToMake() + 1;
    }
}
