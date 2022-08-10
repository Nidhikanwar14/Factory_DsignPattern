package FlightFactory;

import javax.naming.InsufficientResourcesException;

public abstract class bookingFlight  {
      public static int booking(AirbusInterface obj, int seatNo) throws InsufficientResourcesException {

          if(obj.getTotalseats() <0){
              throw new InsufficientResourcesException("No seat available");
          }
          else{
              System.out.println("Seat is booked..");
          }
//          for(int element : obj.getAvailableseats()){
//              if(element == seatNo){
//                  obj.getBookedseats()[element-1] = seatNo;
//                  obj.getAvailableseats()[element-1] = seatNo;
//                  System.out.println("Seat is booked..");
//              }
//              else {
//                  System.out.println("No seats available....");
//              }
//          }
          return 0;
      }
}

