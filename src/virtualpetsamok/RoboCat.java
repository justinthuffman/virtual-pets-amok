package virtualpetsamok;

public class RoboCat extends Cat implements RoboPet {

	private int maintenance = 10;

	public RoboCat(String name, int happiness, int health, int maintenance) {
		super(name, happiness, health);
		this.maintenance = maintenance;

	}

	@Override
	public void tick() {
		petHappiness -= 1;
		maintenance -= 1;

		if (maintenance <= 0 || petHappiness <= 0) {
			petHealth -= 1;
		}
	}

	public void oil() {
		maintenance += 5;
	}

}