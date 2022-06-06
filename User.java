package vehicle;

import java.util.ArrayList;
import java.util.Iterator;

public class User {

	public static void main(String[] args) {

		ArrayList<MotorVehicle> m1 = new ArrayList<MotorVehicle>();

		m1.add(new Car("mh11", "tata", 4));
		m1.add(new Car("mh12", "bollero", 4));
		m1.add(new Truck("mh13", "max", 6));
		m1.add(new Car("mh19", "mahindra", 8));
		m1.add(new MotorCycle("mh15", "tata1", 2));
		m1.add(new MotorCycle("mh16", "tata2", 3));

		
		
		Iterator<MotorVehicle> iter = m1.iterator();

		while (iter.hasNext())
		{
			MotorVehicle m=iter.next();
			System.out.println("Vehicle Details: "+m+", "+"Registration Amount: "+m.registrationAmount());
		}

	}// end of main

//	public static void display(ArrayList<MotorVehicle> a) {
//		Iterator<MotorVehicle> iter = a.iterator();
//
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}

//	}// end of method

}
