package ua.com.foxminded.carmanager;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN, "good");

		Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.BLACK, "uncomfortable");
		
//		Car renault2 = new Bus("Renault Laguna", 2000, 9700, 1600, Color.BLACK, "uncomfortable");

		prius.addDistance(1000);
		prius.addDistance(500000);
		renault.addDistance(10);
		renault.addDistance(0.5);
		prius.addDistance(15000);
		renault.addDistance(15000);
		renault.addDistance(55000);
		
		System.out.println(prius);
		System.out.println(renault);

//		System.out.println(prius.equals(renault2));
//		System.out.println(renault.equals(renault2));
		
		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());
		
	}

}
