package virtualpetsamok;

public class OrganicCat extends Cat implements OrganicPet {
	private int hunger = 0;
	private int thirst = 0;
	private int waste = 0;

	public OrganicCat(String name, int happiness, int health, int hunger, int thirst, int waste) {
		super(name, happiness, health);
		this.setHunger(hunger);
		this.setThirst(thirst);
		this.setWaste(waste);
	}

	@Override
	public void tick() {
		setPetHappiness(getPetHappiness() - 1);
		setHunger(getHunger() + 1);
		setThirst(getThirst() + 1);
		setWaste(getWaste() + 1);
		if (getPetHappiness() <= 0 || getHunger() >= 10 || getThirst() >= 10 || getWaste() >= 10) {
			setPetHealth(getPetHealth() - 1);
		}

	}

	public void feed() {
		setHunger(getHunger() + 5);
	}

	public void water() {
		setThirst(getThirst() + 5);
	}

	public void emptyLitterBox() {
		setWaste(getWaste() - 5);

	}

	public int getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}

	public int getThirst() {
		return thirst;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

}
