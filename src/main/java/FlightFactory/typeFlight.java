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
                    return new AirDomestic();
                case INTERNATIONAL:
                    return new AirInternational();
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
                return new BoiengDomestic();
            case INTERNATIONAL:
                return new BoiengInternational();
        }
        return null;
    }
}