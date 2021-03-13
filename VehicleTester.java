/**
 * Program Name: VehicleTester.java
 * Purpose: Tester class to test the Transport, Aeroplane and Automobile classes.
 * Coder: Fernando Rodrigues Cardoso 0909573
 * Date: Jun 17, 2019
 */

public class VehicleTester
{

	public static void main(String[] args)
	{
		//Creates one aeroplane and one automobile object.
		Aeroplane plane1 = new Aeroplane("Boeing", "787 Dreamliner", "Blue", 125);
		Automobile car1 = new Automobile("Toyota", "Corolla", "Red", 65, 130);
		
		//Printing plane1 and car1 current state.
		System.out.println("Plane1 object :" + plane1.toString());
		System.out.println("Car1 object :" + car1.toString()); 
		
		//Checking plane1 and car1 speed.
		System.out.println("\nPlane1 speed check :" + plane1.checkSpeed());
		System.out.println("Car1 speedcheck :" + car1.checkSpeed()); 
		
		//Create another plane object.
		Aeroplane plane2 = new Aeroplane("Diamond", "Katana", "white", 50);
		
		//Printing plane2 current state.
		System.out.println("\n\nPlane2 object :" + plane2.toString());
		
		//Set the plane2 object to airborne and changes its forward speed to 65.
		plane2.setAirborne(true);
		plane2.setForwardSpeed(65);
		
		//Prints plane2 actual speed, check its spee
		System.out.println("Plane2 forward speed is: " + plane2.getForwardSpeed());
		System.out.println("Plane2 speed check :" + plane2.checkSpeed());
		
		//Set plane2 speed to 40 and prints its speed;
		plane2.setForwardSpeed(40);
		System.out.println("Plane2 forward speed is now " + plane2.getForwardSpeed());
		
		//Check plane2 speed again.
		System.out.println("Plane2 speed check :" + plane2.checkSpeed());

	}
	//end main
}
//end class