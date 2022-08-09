package FlightFactory;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

public interface BoiengInterface {

}


class BoiengDomestic implements BoiengInterface {
    private int totalseats;
    private int[] bookedseats;
    private int[] availableseats;

    public int getTotalseats() {
        return totalseats;
    }

    public int[] getBookedseats() {
        return bookedseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public int[] getAvailableseats() {
        return availableseats;
    }

    public BoiengDomestic(int totalseats) {
        this.bookedseats = new int[totalseats];
        this.availableseats = new int[totalseats];
        for (int i = 0; i < totalseats; i++) {
            this.availableseats[i] = i + 1;
        }


    }

}


    class BoiengInternational implements BoiengInterface {
        private int totalseats;
        private int[] bookedseats;
        private int[] availableseats;

        public int getTotalseats() {
            return totalseats;
        }

        public int[] getBookedseats() {
            return bookedseats;
        }

        public void setTotalseats(int totalseats) {
            this.totalseats = totalseats;
        }

        public int[] getAvailableseats() {
            return availableseats;
        }

        public BoiengInternational(int totalseats) {
            this.bookedseats = new int[totalseats];
            this.availableseats = new int[totalseats];
            for (int i = 0; i < totalseats; i++) {
                this.availableseats[i] = i + 1;
            }

        }
    }