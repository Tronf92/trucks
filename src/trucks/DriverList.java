package trucks;

import java.util.HashMap;

public class DriverList implements IDriverList {
	private HashMap<Integer,Driver> drivers = new HashMap<>();
	
	@Override
	public void addDriver(Driver driverToAdd) throws Exception {
		if (drivers.containsKey(driverToAdd) ){
			throw new Exception("Driver already in list!");
		}
		drivers.put(driverToAdd.getID(), driverToAdd);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drivers == null) ? 0 : drivers.hashCode());
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
		DriverList other = (DriverList) obj;
		if (drivers == null) {
			if (other.drivers != null)
				return false;
		} else if (!drivers.equals(other.drivers))
			return false;
		return true;
	}

	
}
