package trucks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TruckList implements ITruckList {
	private HashMap<Truck,ArrayList<Driver>> trucks = new HashMap<>();
	
	public void addTruck(Truck truckToAdd,ArrayList<Driver> driver) throws Exception {
		if(trucks.containsKey(truckToAdd)){
			throw new Exception("Truck already in list!");
		}
		trucks.put(truckToAdd, driver);
	}

	@Override
	public void addLiters(Truck truck,float liters) {
		for(Truck truck1 : trucks.keySet()){
			if(truck1.equals(truck)){
				truck1.setLitersOfDiesel(liters);
			}
		}
	}

	@Override
	public void addKilometers(Truck truck,int kilometers) {
		for(Truck truck1 : trucks.keySet()){
			if(truck1.equals(truck)){
				truck1.setDrivenKm(kilometers);
			}
		}
	}

	@Override
	public void addDriverToTruck(Driver driver,Truck truck) {
		if(trucks.containsKey(truck)){
			trucks.get(truck);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trucks == null) ? 0 : trucks.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TruckList other = (TruckList) obj;
		if (trucks == null) {
			if (other.trucks != null)
				return false;
		} else if (!trucks.equals(other.trucks))
			return false;
		return true;
	}

}
