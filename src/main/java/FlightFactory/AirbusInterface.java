package FlightFactory;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

public interface AirbusInterface {
    public int getTotalseats();
    public void setTotalseats(int totalseats);
    public int[] getBookedseats();
    public int[] getAvailableseats();
}



class AirDomestic implements AirbusInterface{
    private int totalseats;
    private int[] bookedseats;
    private int[] availableseats;

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public int[] getBookedseats() {
        return bookedseats;
    }

    public int[] getAvailableseats() {
        return availableseats;

    }
    public AirDomestic(int totalseats){
        this.bookedseats = new int[totalseats];
        this.availableseats = new int[totalseats];
        for(int i = 0; i< totalseats ; i++){
            this.availableseats[i] = i+1;
        }
    }

}



class AirInternational implements AirbusInterface{
    private int totalseats;
    private int[] bookedseats;
    private int[] availableseats;

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public int[] getBookedseats() {
        return bookedseats;
    }

    public int[] getAvailableseats() {
        return availableseats;
    }
    public AirInternational(int totalseats){
        this.bookedseats = new int[totalseats];
        this.availableseats = new int[totalseats];
        for(int i = 0; i< totalseats ; i++){
            this.availableseats[i] = i+1;
        }
    }

    }