package design_patterns.decorator;

public class ExtraCheese extends ToppingDecorator{
    private final BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return  basePizza.cost()+ 45;
    }
}
