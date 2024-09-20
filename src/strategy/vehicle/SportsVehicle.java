package strategy.vehicle;

import strategy.drive.SportsDrive;

public class SportsVehicle extends EngineVehicle {
	
	public SportsVehicle(int engineType, int numberOfWheels) {
		super(engineType, numberOfWheels, new SportsDrive());
	}
	
	public String toString() {
		return "Sports car with "+this.getNumberOfWheels()+" wheels and engine type is "+this.getEngineType()+" strokes.";	
	}
	
}
