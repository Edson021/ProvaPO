package pizzariadeliver;

/**
@author Edson
*/

public class Main {

    public static void main(String[] args) {
        EdgeFlavor edge = new EdgeFlavor();
        Flavor flavor = new Flavor();
        Order order = new Order();
        SizePizza size = new SizePizza();
        Drink drink = new Drink();
        
        order.order();
    }
}
