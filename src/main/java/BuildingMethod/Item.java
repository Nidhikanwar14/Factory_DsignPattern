package BuildingMethod;

public interface Item {
    public String name();
    public float price();
    public String size(Size type);
}

abstract class  Pizza implements Item{
    public abstract float price();
}

abstract class ColdDrink implements Item{
    public abstract float price();
}
