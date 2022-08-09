package Insurance_factory;

public interface InsuranceType {

    HealthInterface getHealthInsurance(InsTerm term);

    VehicleInsurance getVehicleInsurance(InsTerm term);
}

class Healthins implements InsuranceType{

    @Override
    public HealthInterface getHealthInsurance(InsTerm term) {
       switch (term){
           case LONGTERM:
               return new LongTermHealth();
           case SHORTTERM:
               return new ShortTermHealth();
       }
       return null;
    }

    @Override
    public VehicleInsurance getVehicleInsurance(InsTerm term) {
        return null;
    }
}

class Vehicleins implements InsuranceType{

    @Override
    public HealthInterface getHealthInsurance(InsTerm term) {
        return null;
    }

    @Override
    public VehicleInsurance getVehicleInsurance(InsTerm term) {
        switch (term){
            case SHORTTERM:
                return new LongTermVehicle();
            case LONGTERM:
                return new ShortTermVehicle();
        }
        return null;
    }
}