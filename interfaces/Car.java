
public class Car extends MotorizedVehicle implements IVehicle {
	public void drive()
	{
		System.out.println("the car is moving");
	}
	public void turnLeft()
	{
		System.out.println("tha car is turning Left");
	}
	public void brake()
	{
		System.out.println("the car is in brake mode");
	}

}
