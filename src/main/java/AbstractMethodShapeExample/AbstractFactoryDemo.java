package AbstractMethodShapeExample;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        ShapeInterface shape1 = shapeFactory.getRoundedShape(RoundedShape.ROUNDEDRECTANGLE);
        shape1.draw();

    }
}
