package virtualpetsamok;

public class OrganicDog extends Dog implements OrganicPet {
	private int hunger = 0;
	private int thirst = 0;
	private int waste = 0;

	public OrganicDog(String name, int happiness, int health, int hunger, int thirst, int waste) {
		super(name, happiness, health);
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
	}

	@Override
	public void tick() {
		petHappiness -= 1;
		hunger += 1;
		thirst += 1;
		waste += 1;
		if (petHappiness <= 0 || hunger >= 10 || thirst >= 10 || waste >= 10) {
			petHealth -= 1;
		}
	}

	public void feed() {
		hunger -= 5;
	}

	public void water() {
		thirst -= 5;
	}

	public void walk() {
		super.walk();
		waste -= 5;
	}

	public void cleanCages() {
		waste -= 5;
	}

}
