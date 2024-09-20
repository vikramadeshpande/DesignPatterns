package strategy.vehicle;

import strategy.drive.NormalDrive;

public class SuvVehicle extends EngineVehicle {

	public SuvVehicle(int engineType, int numberOfWheels) {
		super(engineType, numberOfWheels, new NormalDrive());
	}

	public String toString() {
		return "SUV car with "+this.getNumberOfWheels()+" wheels and engine type is "+this.getEngineType()+" strokes.";	
	}
}
