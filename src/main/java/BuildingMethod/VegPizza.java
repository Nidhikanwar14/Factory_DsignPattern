package BuildingMethod;

public class VegPizza extends Pizza{
    @Override
    public String name() {
        return "VegPizza";
    }

    @Override
    public String size(Size type) {
        switch (type){
            case SMALL:
                return "small size pizza..";
            case MEDIUM:
                return "Medium size pizza..";
            case LARGE:
                return  "Large size pizza...";
        }
        return null;
    }

    @Override
    public float price() {
        return 120.0f;
    }



}
class NonVegPizza extends Pizza{
    @Override
    public String name() {
        return "NonVegPizza";
    }

    @Override
    public String size(Size type) {
        switch (type){
            case SMALL:
                return "small size pizza..";
            case MEDIUM:
                return "Medium size pizza..";
            case LARGE:
                return  "Large size pizza...";
        }
        return null;
    }

    @Override
    public float price() {
        return 180.0f;
    }
}
