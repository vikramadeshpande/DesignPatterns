package strategy.vehicle;

import strategy.drive.PeddleDrive;

public class BiCycle extends NonEngineVehicle {

	public BiCycle(int numberOfWheels) {
		super(numberOfWheels, new PeddleDrive());
	}
	
	public String toString() {
		return "BiCycle with "+this.getNumberOfWheels()+" wheels.";	
	}
}
