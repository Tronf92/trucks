package trucks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TruckListTest {
	private ArrayList <Driver> drivers = new ArrayList();
	private Truck truck = new Truck(1,"AR00ABC",105487,30.2,1000);
	
	@Test
	public void test() throws Exception {
		Driver driver = new Driver(1,"John","Deer",123456);
		TruckList truckListTest = new TruckList();
		try{
			drivers.add(driver);
			truckListTest.addTruck(truck, drivers);
			truckListTest.addTruck(truck, drivers);
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Truck already in list!");
		}
	}

}
