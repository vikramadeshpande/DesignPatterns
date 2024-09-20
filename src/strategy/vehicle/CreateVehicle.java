package strategy.vehicle;

public class CreateVehicle {

	public static void main(String[] args) {
		
		Vehicle v = new SportsVehicle(2, 4);
		System.out.println(v);
		
		v = new SuvVehicle(2, 4);
		System.out.println(v);
		
		v = new BiCycle(2);
		System.out.println(v.toString());
		System.out.println(v);
	}

}
