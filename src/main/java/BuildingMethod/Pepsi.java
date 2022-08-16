package BuildingMethod;

public class Pepsi  extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public String size(Size type) {
        switch (type){
            case SMALL:
                return "small size pepsi..";
            case MEDIUM:
                return "Medium size pepsi..";
            case LARGE:
                return  "Large size pepsi..";
        }
        return null;
    }

    @Override
    public float price() {
        return 50.0f;
    }
}

class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public String size(Size type) {
        switch (type){
            case SMALL:
                return "small size coke..";
            case MEDIUM:
                return "Medium size coke..";
            case LARGE:
                return  "Large size coke..";
        }
        return null;
    }

    @Override
    public float price() {
        return 70.0f;
    }
}
