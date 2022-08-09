package NewFactoryMethod;

public interface Health_Interface {
    public void getHealthInsurance();
}

class LongTermHealth implements Health_Interface{

    @Override
    public void getHealthInsurance() {
        System.out.println("Long term health insurance...");
    }
}
class ShortTermHealth implements Health_Interface{

    @Override
    public void getHealthInsurance() {
        System.out.println("Short term health insurance...");
    }
}
