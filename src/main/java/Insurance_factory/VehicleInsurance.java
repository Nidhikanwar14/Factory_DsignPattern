package Insurance_factory;

public interface VehicleInsurance {
    public void getVehicleIns();
}

class LongTermVehicle implements VehicleInsurance{

    @Override
    public void getVehicleIns() {
        System.out.println("Long term Vehicle insurance....");
    }
}class ShortTermVehicle implements VehicleInsurance{

    @Override
    public void getVehicleIns() {
        System.out.println("Short term Vehicle insurance....");
    }
}
