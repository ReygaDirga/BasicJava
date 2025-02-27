package Restaurant;
import java.util.*;
public class Restaurant {
    private List <Dish> menu = new ArrayList<>();

    void addDish(Dish dish) {
        menu.add(dish);
        System.out.println("Dish added to menu: " + dish.getDish());
    }

    void placeOrder(Customer customer, Dish dish) {
        customer.orders.add(dish);
        menu.remove(dish);
        System.out.println(customer.getName() + " ordered: " + dish.getDish());
    }

    void cancelOrder(Customer customer, Dish dish) {
        menu.add(dish);
        customer.orders.remove(dish);
        System.out.println(customer.getName() + " cancelled: " + dish.getDish());
    }

    void displayMenu() {
        System.out.println("Menu:");
        for (Dish dish : menu) {
            dish.printDish();
        }
    }
}
