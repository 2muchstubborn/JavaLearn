package ua.com.foxminded.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color, String comfort) {
		super(name, yearOfProduction, price, weight, color, comfort);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 10000) {
			return true;
		} else  {
			return false;
		}
	}

	
	
}
