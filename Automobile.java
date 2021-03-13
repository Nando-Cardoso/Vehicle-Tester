/**
 * Program Name: Automobile.java
 * Purpose: Defining the Automobile subclass attributes and behaviours.
 * Coder: Fernando Rodrigues Cardoso 0909573
 * Date: Jun 17, 2019
 */

public class Automobile extends Transport
{
	//--Attributes--
	
	private String maker;
	private String model;
	private int initialSpeed;
	private int maxSafeSpeed;
	
	//--Constructor--
	
	public Automobile(String maker, String model, String color,  int initialSpeed, int maxSafeSpeed)
	{
		super("Automobile", color, initialSpeed);
		this.maker = maker;
		this.model = model;
		this.initialSpeed = initialSpeed;
		this.maxSafeSpeed = maxSafeSpeed;
	}

	//--Getters--
	
	public String getMaker()
	{
		return maker;
	}

	public String getModel()
	{
		return model;
	}

	public int getMaxSafeSpeed()
	{
		return maxSafeSpeed;
	}
	
	//Overriding toString() from superclass.
	public String toString() 
	{
		return super.toString() + " This car is a " + model + " that is made by " + maker + ".";
	}
	
	//Defining abstract method checkSpeed from superclass.
	@Override
	public String checkSpeed() {
		if ((getForwardSpeed() / maxSafeSpeed) > 0.95) {
			return "Warning: vehicle speed is at safety limits! SLOW DOWN!";
		}
		
		return "Current car speed is within safe limits";
	}
}
//end class