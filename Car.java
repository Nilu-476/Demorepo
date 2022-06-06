package vehicle;

public class Car extends MotorVehicle{

	
	private int noofwheels;
	
	
	
	public Car(String registration,String name,int noofwheels)
	{
		super(registration,name);
		this.noofwheels=noofwheels;
		
	}
	
	@Override
	public String toString() 
	{
		String str=super.toString();
		return str;
	}
	
	@Override
	public double registrationAmount()
	{
		return 5000*this.noofwheels*12.2;
	}
}
