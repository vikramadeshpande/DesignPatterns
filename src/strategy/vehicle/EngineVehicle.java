package strategy.vehicle;

import strategy.drive.DriveStrategy;

public class EngineVehicle extends Vehicle {
		
	private int engineType;

	public EngineVehicle(int engineType, int numberOfWheels,DriveStrategy driveStrategy ) {
		super(numberOfWheels,driveStrategy);
		this.engineType = engineType;
	}

	public int getEngineType() {
		return engineType;
	}
}
