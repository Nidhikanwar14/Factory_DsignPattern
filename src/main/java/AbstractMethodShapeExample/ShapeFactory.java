package AbstractMethodShapeExample;

class ShapeFactory extends AbstractFactory{


    @Override
    ShapeInterface getShape(ShapeEnum shapeType) {
        switch (shapeType){
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Sqaure();
        }

        return null;
    }



    @Override
    ShapeInterface getRoundedShape(RoundedShape shapeType) {
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory{


    @Override
    ShapeInterface getShape(ShapeEnum shapeType) {
        return null;
    }

    @Override
    ShapeInterface getRoundedShape(RoundedShape shapeType) {
        switch (shapeType){
            case ROUNDEDSQUARE:
                return new RoundedSquare();
            case ROUNDEDRECTANGLE:
                return new RoundedRectangle();
        }
        return null;
    }
}