public class Car {
  int seats;
  double tripPrize;
  boolean available;

  public Car(int noOfSeats, double oneTripPrize, boolean isCarAvailable){
   seats = noOfSeats;
   tripPrize = oneTripPrize;
   available = isCarAvailable;

  }
public static void main(String args[]) {
  Car voxy = new Car(8, 1200.75, true);
  Car ferrari = new Car(4, 2500.05, false);
  Car wish = new Car(7, 1000.50, true);
  boolean isFerrariCheaper = ferrari.tripPrize < wish.tripPrize;
  int totalSeats = voxy.seats + ferrari.seats + wish.seats;
  

  System.out.println("Wish has " + wish.seats + " seats and a trip goes at " + wish.tripPrize + " shillings");
  System.out.println("The statement that ferrari is cheaper per trip is: " + isFerrariCheaper);
  System.out.println("The total number is seats is " + totalSeats);
}
  
}
