package Restaurant;

public class Main {

    public Main() {
        Chef chef1 = new Chef("Gordon Ramsay", "Expert in fine dining and Michelin-star dishes.");
        Chef chef2 = new Chef("Jamie Oliver", "Famous for healthy and simple recipes.");

        Dish dish1 = new Dish("Beef Wellington", "001", chef1);
        Dish dish2 = new Dish("Pasta Carbonara", "002", chef2);

        Restaurant restaurant = new Restaurant();

        restaurant.addDish(dish1);
        restaurant.addDish(dish2);

        Customer customer = new Customer("John");

        restaurant.placeOrder(customer, dish1);
        restaurant.placeOrder(customer, dish2);

        customer.displayOrders();

        restaurant.cancelOrder(customer, dish1);

        customer.displayOrders();

        restaurant.displayMenu();
    }

    public static void main(String[] args) {
        new Main();
    }
}
