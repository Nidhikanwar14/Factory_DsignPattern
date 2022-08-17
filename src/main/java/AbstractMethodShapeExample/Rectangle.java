package AbstractMethodShapeExample;

 class Rectangle implements ShapeInterface{
    @Override
    public void draw() {
        System.out.println("Rectangle shape is drwan..");
    }
}

class Sqaure implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("Square shape is drawn...");
    }
}

class RoundedRectangle implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("Rounded shape rectnagle is drawn...");
    }
}

class RoundedSquare implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("Rounded Shape Square is drawn..");
    }
}