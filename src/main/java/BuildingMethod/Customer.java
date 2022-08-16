package BuildingMethod;

public class Customer {
    public static void main(String[] args){
        MealBuilder customer = new MealBuilder();
        OrderItem prepizza = customer.preparePizza();
        prepizza.showItems();
        prepizza.totalCost();
    }
}
