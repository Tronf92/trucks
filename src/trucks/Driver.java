package trucks;

public class Driver{
	private int ID;
	private String name;
	private String surname;
	private int drivingLicense;
	
	public Driver(int ID, String name, String surname, int drivingLicense) {
		super();
		this.ID = ID;
		this.name = name;
		this.surname = surname;
		this.drivingLicense = drivingLicense;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(int drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	
	
	
}
