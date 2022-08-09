package FlightFactory;

public class bookingFlight {
     boolean flag = true;
      public int booking(AirbusInterface obj , int seatNo){
          for(int element : obj.getAvailableseats()){
              if(element == seatNo){
                  obj.getBookedseats()[element-1] = seatNo;
                  obj.getAvailableseats()[element-1] = seatNo;
              }
              else {
                  System.out.println("No seats available....");
              }
          }
          return 0;
      }
}

