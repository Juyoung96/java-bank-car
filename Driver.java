/*
 * Project: Driver.java
 * DescriptionL He takes a trip in a car and fills up, check gas levels
 * Name: Juyoung 
 * Date: Oct 5, 2015
 */

public class Driver {
  
  public static void main( String[] args ) {
    
    // 24 mpg
    Car myBmw = new Car ( 24 );
    
    // fill up 20 gallons
    myBmw.fillUp ( 20 );
    
    // drive 100 miles
    myBmw.takeTrip( 100 );
    
    // report fuel left ( 15.83333333333333332 )
    System.out.println( "You have " + myBmw.reportFuel() + " gallons left." );
    
    // Bragging method 
    Car myTesla = new Car ( 42, 20, "Tesla", "Model X", "white", 2016, 400, 3.2 );
    myTesla.bragOnYourCar();
    
  } // end main method
  
}  // end class