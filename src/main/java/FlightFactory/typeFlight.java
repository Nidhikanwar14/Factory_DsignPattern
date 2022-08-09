package FlightFactory;

public interface typeFlight {
    AirbusInterface createAirbusFlight(FlightType type);
    BoiengInterface createBoiengFlight(FlightType type);

}
class airbustype implements typeFlight{

        @Override
        public AirbusInterface createAirbusFlight(FlightType type) {
            switch (type){
                case DOMESTIC:
                    return new AirDomestic(20);
                case INTERNATIONAL:
                    return new AirInternational(20);
            }
            return null;
        }

        @Override
        public BoiengInterface createBoiengFlight(FlightType type) {
            return null;
        }
}

class Boeingtype implements typeFlight {


    @Override
    public AirbusInterface createAirbusFlight(FlightType type) {
        return null;
    }

    @Override
    public BoiengInterface createBoiengFlight(FlightType type) {
        switch (type) {
            case DOMESTIC:
                return new BoiengDomestic(20);
            case INTERNATIONAL:
                return new BoiengInternational(20);
        }
        return null;
    }
}