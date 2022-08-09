package FlightFactory;

public class factoryFlight {
    public static typeFlight getFlightName(FlightName name){
        switch (name){
            case AIRBUS:
                return new airbustype();
            case BOIENFG:
                return new Boeingtype();
        }
        return null;
    }

}
