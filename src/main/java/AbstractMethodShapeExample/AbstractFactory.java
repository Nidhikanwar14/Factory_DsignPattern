package AbstractMethodShapeExample;

abstract class AbstractFactory {
    abstract ShapeInterface getShape(ShapeEnum shapeType);
    abstract ShapeInterface getRoundedShape(RoundedShape shapeType);
}
