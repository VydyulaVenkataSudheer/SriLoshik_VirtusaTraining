
public class Train implements IVehicle , IPublicTransport {
	public void drive()
	{
		System.out.println("the Train is moving");
	}
	public void turnLeft()
	{
		System.out.println("tha Train is turning Left");
	}
	public void brake()
	{
		System.out.println("the Train is in brake mode");
	}
	public void getNumberOfPeople()
	{
		System.out.println("The train has lot of people");
	}
}
