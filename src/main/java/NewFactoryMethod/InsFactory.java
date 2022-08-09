package NewFactoryMethod;

public class InsFactory {

    public static Insurance getInsType(InsuranceTYPE type) {
        switch (type) {
            case HEALTH:
                return new HealthINS();
            case VEHICLE:
                return new Vehicleins();
        }
        return null;
    }
}