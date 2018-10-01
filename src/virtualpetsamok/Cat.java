package virtualpetsamok;

public class Cat extends VirtualPet {

	public Cat(String name, int happiness, int health) {
		super(name, happiness, health);
	}

	@Override
	public void tick() {
		setPetHappiness(getPetHappiness() - 1);
	}

}
