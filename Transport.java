/**
 * Program Name: Transport.java
 * Purpose: Defining the Transport superclass attributes and behaviours.
 * Coder: Fernando Rodrigues Cardoso 0909573
 * Date: Jun 17, 2019
 */

public abstract class Transport
{
	//--Attributes--
	
	private String vehicleType;
	private String color;
	private boolean isMoving;
	private int forwardSpeed;
	
	//--Constructor--
	
	public Transport(String vehicleType, String color, int forwardSpeed)
	{
		super();
		this.vehicleType = vehicleType;
		this.color = color;
		this.forwardSpeed = forwardSpeed;
		if (forwardSpeed > 0) {
			isMoving = true;
		}
		else if (forwardSpeed == 0) {
			isMoving = false;
		}
	}
	
	//--Getters--
	
	public String getVehicleType()
	{
		return vehicleType;
	}
	public String getColor()
	{
		return color;
	}
	public boolean getIsMoving()
	{
		return isMoving;
	}
	public int getForwardSpeed()
	{
		return forwardSpeed;
	}
	
	//--Setter--
	
	public void setForwardSpeed(int newSpeed)
	{
		this.forwardSpeed = newSpeed;
		if (newSpeed > 0) {
			isMoving = true;
		}
		else if (newSpeed == 0) {
			isMoving = false;
		}
	}
	
	//Overriding toString() method.
	public String toString()
	{
		return "This vehicle is a(n) " + vehicleType + ", its color is " + color + ".\nCurrent "
				+ "speed is " + forwardSpeed + " so, the in motion state is " + isMoving + ".";
	}
	
	//Defining a abstract method.
	public abstract String checkSpeed();
}
//end class