package design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        /**
         * pizza price list:
         * Margherita: 100
         * VegDelight: 200
         */

        /**
         * Topping price list
         * Extra Cheese: 45
         * Mushroom: 60
         */


        //person 1 ordered: Veg Delight with extra cheese and additional mushroom topping

        //let's cook

        // 1 make simple veg delight first
        BasePizza vegDelight = new VegDelight();

        // 2 add extra cheese in veg Delight
        vegDelight = new ExtraCheese(vegDelight);

        // 3 add mushroom
        vegDelight = new Mushroom(vegDelight);

        // see final price
        System.out.println(vegDelight.cost()); //305 rupees

        //person 2 ordered: margherita with 2 extra cheese
        BasePizza finalOrder = new ExtraCheese(new ExtraCheese(new Margherita()));
        System.out.println(finalOrder.cost()); // 190
    }
}
