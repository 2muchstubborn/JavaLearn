package ua.com.foxminded.carmanager;

public interface Serviceable {

	
	public abstract boolean isReadyToService() ;

	public int getDistanceOnService();
	
	public void addDistance(int additionalDistance);
	
	public void addDistance(double additionalDistance);
}
