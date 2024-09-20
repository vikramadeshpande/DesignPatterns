package strategy.vehicle;

import strategy.drive.DriveStrategy;

public class NonEngineVehicle extends Vehicle{

	public NonEngineVehicle(int numberOfWheels, DriveStrategy driveStrategy) {
		super(numberOfWheels, driveStrategy);
	}
}
