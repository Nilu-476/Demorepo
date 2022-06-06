package vehicle;

public abstract class MotorVehicle {     //abstract class

	private String registration;
	private String name;
	
	
	
	public MotorVehicle(String registration,String name)
	{
		this.registration=registration;
		this.name=name;
		
		
	}
	
	@Override
	public String toString()
	{
		String str=this.registration+","+this.name;
		return str;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public abstract double registrationAmount();  //abstract method
	
	
	
}
