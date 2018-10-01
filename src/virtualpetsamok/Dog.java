package virtualpetsamok;

public abstract class Dog extends VirtualPet {

	public Dog(String name, int happiness, int health) {
		super(name, happiness, health);
	}

	public void walk() {
		setPetHappiness(getPetHappiness() + 5);
	}

	@Override
	public void tick() {
		setPetHappiness(getPetHappiness() - 1);
	}

}
