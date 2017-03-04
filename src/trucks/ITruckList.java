package trucks;

import java.util.ArrayList;

public interface ITruckList {
	public void addTruck(Truck truckToAdd,ArrayList<Driver> driver)throws Exception;
	void addDriverToTruck(Driver driver,Truck truck);
	public void addLiters(Truck truck,float liters);
	public void addKilometers(Truck truck,int kilometers);
	
}
