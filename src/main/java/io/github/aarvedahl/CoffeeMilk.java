package io.github.aarvedahl;

public class CoffeeMilk extends Decorator {
    public CoffeeMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.description + ", milk";
    }

    @Override
    public Double ingredientsPrice() {
        return beverage.ingredientsPrice() + 1;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 5.50;
    }
}