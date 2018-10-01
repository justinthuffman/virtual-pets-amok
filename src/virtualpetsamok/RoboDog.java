package virtualpetsamok;

public class RoboDog extends Dog implements RoboPet {

	private int maintenance;

	public RoboDog(String name, int happiness, int health, int maintenance) {
		super(name, happiness, health);
		this.setMaintenance(maintenance);

	}

	@Override
	public void tick() {
		setPetHappiness(getPetHappiness() - 1);
		setMaintenance(getMaintenance() - 1);

		if (getMaintenance() <= 0 || getPetHappiness() <= 0) {
			setPetHealth(getPetHealth() - 1);
		}
	}

	public void oil() {
		setMaintenance(getMaintenance() + 5);
	}

	public int getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}

}
