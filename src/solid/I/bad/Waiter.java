package solid.I.bad;


//waiter is a restaurant employee so implementing the interface,
//but it's forcing to write all methods that waiter don't need like looking and washing dishes
public class Waiter implements RestaurantEmployee {


    /**
     * forcing it
     */
    @Override
    public void washDishes() {
        // being forced to write it, although not needed
    }

    /**
     * only useful method
     */
    @Override
    public void serveCustomers() {
        System.out.println("Serving customers");
    }

    /**
     * forcing it
     */
    @Override
    public void cookFood() {
        // being forced to write it, although not needed

    }
}
