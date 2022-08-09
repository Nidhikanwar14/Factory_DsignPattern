package Insurance_factory;

public interface HealthInterface {

    public void getHealthIns();
}


class LongTermHealth implements HealthInterface{

    @Override
    public void getHealthIns() {
        System.out.println("Long term health insurance....");
    }
}class ShortTermHealth implements HealthInterface{

    @Override
    public void getHealthIns() {
        System.out.println("Short term health insurance....");
    }
}

