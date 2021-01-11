package ncs.test9;

public class Cargoplane extends Plane {

	
	
	
	public Cargoplane() {}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		int discount = distance/10*50;
		setFuelSize(getFuelSize()-discount);
	}

}
