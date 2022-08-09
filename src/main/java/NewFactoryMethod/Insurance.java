package NewFactoryMethod;

public interface Insurance {
    Vehicle_Interface getVehicleInsurance( InsuranceTerm term);

    Health_Interface getHealthInsurance(InsuranceTerm term);
}

class Vehicleins implements Insurance{

    @Override
    public Vehicle_Interface getVehicleInsurance(InsuranceTerm term) {
        switch (term){
            case LONG_TERM:
                return new LongTermVehicle();
            case SHORT_TERM:
                return new ShortTermVehicle();
        }
        return null;
    }

    @Override
    public Health_Interface getHealthInsurance( InsuranceTerm term) {
        return null;
    }
}

class HealthINS implements Insurance{

    @Override
    public Vehicle_Interface getVehicleInsurance(InsuranceTerm term) {
        return null;
    }

    @Override
    public Health_Interface getHealthInsurance(InsuranceTerm term) {
        switch (term){
            case SHORT_TERM:
                return new ShortTermHealth();
            case LONG_TERM:
                return new LongTermHealth();
        }
        return null;
    }
}