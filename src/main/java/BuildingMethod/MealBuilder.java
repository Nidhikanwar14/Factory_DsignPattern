package BuildingMethod;

public class MealBuilder {

    public OrderItem preparePizza(){
        OrderItem order = new OrderItem();
        order.getItems(new VegPizza());
        order.getItems(new NonVegPizza());
        return order;
    }

    public OrderItem prepareColdDrinks(){
        OrderItem order = new OrderItem();
        order.getItems(new Coke());
        order.getItems(new Pepsi());

        return order;
    }
}
