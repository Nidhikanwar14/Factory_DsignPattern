package NewFactoryMethod;

public interface Vehicle_Interface {
    public void getVehicleInsurance();
}
class LongTermVehicle implements Vehicle_Interface{

    @Override
    public void getVehicleInsurance() {
        System.out.println("Long term vehicle insurance...");
    }
}
class ShortTermVehicle implements Vehicle_Interface{

    @Override
    public void getVehicleInsurance() {
        System.out.println("Short term vehicle insurance...");
    }
}