package BridgePatternMethod;

 interface DrawApi {
     void drawCircle();
}


class RedCircle implements DrawApi{

    @Override
    public void drawCircle() {
        System.out.println("Draw red circle.......");
    }
}

class GreenCircle implements DrawApi{

    @Override
    public void drawCircle() {
        System.out.println("Draw green circle........");
    }
}