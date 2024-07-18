package design_patterns.decorator;

public class Mushroom extends ToppingDecorator{
    private final BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 60;
    }
}
