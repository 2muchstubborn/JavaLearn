package ua.com.foxminded.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, Color color, String comfort) {
		super(name, yearOfProduction, price, weight, color, comfort);
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 50000) {
			return true;
		} else  {
			return false;
		}
	
	}

	
}
