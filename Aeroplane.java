/**
 * Program Name: Aeroplane.java
 * Purpose: Defining the Aeroplane subclass attributes and behaviours.
 * Coder: Fernando Rodrigues Cardoso 0909573
 * Date: Jun 17, 2019
 */

public class Aeroplane extends Transport
{
	//--Attributes
	
	private String maker;
	private String model;
	private boolean isAirborne;
	private int stallSpeed;
	
	//--Constructor--
	
	public Aeroplane(String maker, String model, String color,  int stallSpeed)
	{
		super("Aeroplane", color, 0);
		this.maker = maker;
		this.model = model;
		this.stallSpeed = stallSpeed;
		setAirborne(false);
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

	public boolean isAirborne()
	{
		return isAirborne;
	}

	public int getStallSpeed()
	{
		return stallSpeed;
	}

	//--Setter--
	
	public void setAirborne (boolean isAirborne)
	{
		this.isAirborne = isAirborne;
	}

	//Overriding toString() from superclass.
	public String toString() 
	{
		return super.toString() + " This aeroplane is a " + model + " that is made by " + maker + ".";
	}

	//Defining abstract method checkSpeed() from superclass.
	@Override
	public String checkSpeed()
	{
		if (!isAirborne) {
			return "Aeroplane is not airborne at this time";
		}
		
		else if (isAirborne && (getForwardSpeed() <= stallSpeed)) {
			return "Warning: airspeed is at or below stall speed! Increase speed NOW!";
		}
		
		return "Current airspeed is within safe limits";
	}
	
	
	//end main
}
//end class