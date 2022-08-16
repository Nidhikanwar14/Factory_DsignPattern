package BuildingMethod;

import java.util.ArrayList;

public class OrderItem {
    ArrayList<Item> items = new ArrayList<>();

    public void getItems(Item item)
    {
            items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;
        for (Item item:items) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        System.out.println("Your Order:");
        for (Item item:items) {
            System.out.println("Item Name:" + item.name());
            System.out.println("Item Price: " + item.price());
            System.out.println("Item Size:" + item.size(Size.LARGE));
        }
    }
    public void totalCost(){
        System.out.println("Total Cost= "+getCost());
    }


}
