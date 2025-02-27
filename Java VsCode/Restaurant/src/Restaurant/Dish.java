package Restaurant;

public class Dish {
    private String dish;
    private String id;
    private Chef chef;

    Dish(String dish, String id, Chef chef){
        this.dish = dish;
        this.id = id;
        this.chef = chef;
    }

    String getDish(){
        return dish;
    }

    String getId(){
        return id;
    }

    Chef getChef(){
        return chef;
    }

    void printDish(){
        System.out.println("Dish: " + dish);
        System.out.println("ID: " + id);
        System.out.println("Chef: " + chef.getName());
        System.out.println("Biography: " + chef.getBiography());
    }
}

