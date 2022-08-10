package FlightFactory;

import javax.naming.InsufficientResourcesException;
import java.awt.print.Book;

public class flight {
    public static void main(String[] args) throws InsufficientResourcesException {
        typeFlight obj1 = factoryFlight.getFlightName(FlightName.AIRBUS);
        AirbusInterface user = obj1.createAirbusFlight(FlightType.DOMESTIC);

        bookingFlight.booking(user,5);

    }
}
