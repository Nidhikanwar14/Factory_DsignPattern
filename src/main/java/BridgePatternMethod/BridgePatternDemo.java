package BridgePatternMethod;

public class BridgePatternDemo {

    public static void main(String[] args){
        ShapeAbstract redCircle = new Circle(new RedCircle());
        redCircle.draw();

        ShapeAbstract greenCircle = new Circle(new GreenCircle());
        greenCircle.draw();

    }
}
