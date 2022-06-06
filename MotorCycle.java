package vehicle;

public class MotorCycle extends MotorVehicle{

	
	private int noofwheels;
	
	
	
	public MotorCycle(String registration,String name,int noofwheels)
	{
		super( registration,name);
		
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

		return 5000*8.2*this.noofwheels;
	}
}
