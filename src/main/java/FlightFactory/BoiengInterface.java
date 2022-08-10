package FlightFactory;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

public interface BoiengInterface {
    public ArrayList<Integer> getAvailableseats();
    public ArrayList<Integer> getBookedseats();
    public int getTotalseats();
    public void setter(int totalseats);
    public void welcome();
}



class BoiengDomestic implements BoiengInterface {
    private int totalseats;
    private ArrayList<Integer> availableseats = new ArrayList<>(totalseats);
    private ArrayList<Integer> bookedseats = new ArrayList<>(totalseats);

    public ArrayList<Integer> getAvailableseats() {
        return availableseats;
    }

    public ArrayList<Integer> getBookedseats() {
        return bookedseats;
    }

    public int getTotalseats() {
        return totalseats;
    }

    public void setter(int totalseats){
        this.totalseats = totalseats;
        for(int i = 1 ; i<totalseats ;i++){
            this.availableseats.add(i);
            this.bookedseats.add(i);
        }
    }
    public void welcome(){
        System.out.println("Welcome to BoeingDomestic... ");
    }
}


    class BoiengInternational implements BoiengInterface {
        private int totalseats;
        private ArrayList<Integer> availableseats = new ArrayList<>(totalseats);
        private ArrayList<Integer> bookedseats = new ArrayList<>(totalseats);


        public ArrayList<Integer> getAvailableseats() {
            return availableseats;
        }

        public ArrayList<Integer> getBookedseats() {
            return bookedseats;
        }

        public int getTotalseats() {
            return totalseats;
        }

        public void setter(int totalseats){
            this.totalseats = totalseats;
            for(int i = 1 ; i<totalseats ;i++){
                this.availableseats.add(i);
                this.bookedseats.add(i);
            }
        }

        public void welcome(){
            System.out.println("Welcome to BoeingInternational... ");
        }
    }