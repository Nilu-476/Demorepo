package vehicle;

public class Truck extends MotorVehicle{

	
	private int noofwheels;
	
	
	public Truck(String registration,String name,int noofwheels)
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
		return 5000*10.2*this.noofwheels;
	}
}
