package BridgePatternMethod;

abstract class ShapeAbstract {
   protected DrawApi drawApi;
   protected ShapeAbstract(DrawApi drawApi){
       this.drawApi = drawApi;
   }

   abstract void draw();
}


class Circle extends ShapeAbstract {

    protected Circle(DrawApi drawApi) {
        super(drawApi);
    }

    @Override
    void draw() {
       drawApi.drawCircle();
    }
}