package trucks;

public class Truck {
	private int ID;
	private String plateNr;
	private int drivenKm;
	private double averageFuelConsumptionByProducer;
	private float litersOfDiesel;
	
	public Truck(int ID,String plateNr, int drivenKm, double d, float litersOfDiesel) {
		this.ID = ID;
		this.plateNr = plateNr;
		this.drivenKm = drivenKm;
		this.averageFuelConsumptionByProducer = d;
		this.litersOfDiesel = litersOfDiesel;
	}

	public int getID(){
		return ID;
	}
	
	public String getPlateNr() {
		return plateNr;
	}

	public void setPlateNr(String plateNr) {
		this.plateNr = plateNr;
	}

	public int getDrivenKm() {
		return drivenKm;
	}

	public void setDrivenKm(int drivenKm) {
		this.drivenKm = drivenKm;
	}

	public double getAverageFuelConsumptionByProducer() {
		return averageFuelConsumptionByProducer;
	}

	public void setAverageFuelConsumptionByProducer(float averageFuelConsumptionByProducer) {
		this.averageFuelConsumptionByProducer = averageFuelConsumptionByProducer;
	}

	public float getLitersOfDiesel() {
		return litersOfDiesel;
	}

	public void setLitersOfDiesel(float litersOfDiesel) {
		this.litersOfDiesel = litersOfDiesel;
	}
	
}
