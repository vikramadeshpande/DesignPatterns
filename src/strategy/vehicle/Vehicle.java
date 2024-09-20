package strategy.vehicle;

import strategy.drive.DriveStrategy;

abstract class Vehicle {
	
	private int numberOfWheels;
	DriveStrategy driveStrategy;
	
	public Vehicle(int numberOfWheels,DriveStrategy driveStrategy) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.driveStrategy = driveStrategy;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}
}
