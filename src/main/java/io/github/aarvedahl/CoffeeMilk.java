package io.github.aarvedahl;

public class CoffeeMilk extends Decorator {
    public CoffeeMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    Double cost() {
        return beverage.cost() + 5.90;
    }
}
