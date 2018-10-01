package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldGetOrganicDogName() {
		// arrange
		VirtualPet underTest = new OrganicDog("Name", 0, 0, 0, 0, 0);
		// act
		String actual = underTest.getPetName();
		// assert
		assertEquals("Name", actual);
	}

	@Test
	public void shouldGetOrganicCatName() {
		// arrange
		VirtualPet underTest = new OrganicCat("Name", 0, 0, 0, 0, 0);
		// act
		String actual = underTest.getPetName();
		// assert
		assertEquals("Name", actual);
	}

	@Test
	public void shouldGetRoboDogName() {
		// arrange
		VirtualPet underTest = new RoboDog("Name", 0, 0, 0);
		// act
		String actual = underTest.getPetName();
		// assert
		assertEquals("Name", actual);
	}

	@Test
	public void shouldGetRoboCatName() {
		// arrange
		VirtualPet underTest = new RoboCat("Name", 0, 0, 0);
		// act
		String actual = underTest.getPetName();
		// assert
		assertEquals("Name", actual);
	}

	@Test
	public void shouldGetOrganicDogHappiness() {
		// arrange
		VirtualPet underTest = new OrganicDog("Name", 10, 0, 0, 0, 0);
		// act
		int actual = underTest.getPetHappiness();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void shouldGetOrganicCatHappiness() {
		// arrange
		VirtualPet underTest = new OrganicCat("Name", 10, 0, 0, 0, 0);
		// act
		int actual = underTest.getPetHappiness();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void shouldGetRoboDogHappiness() {
		// arrange
		VirtualPet underTest = new RoboDog("Name", 10, 0, 0);
		// act
		int actual = underTest.getPetHappiness();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void shouldGetRoboCatHappiness() {
		// arrange
		VirtualPet underTest = new RoboCat("Name", 10, 0, 0);
		// act
		int actual = underTest.getPetHappiness();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void shouldGetOrganicDogHealth() {
		// arrange
		VirtualPet underTest = new OrganicDog("Name", 0, 10, 0, 0, 0);
		// act
		int actual = underTest.getPetHealth();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void shouldGetOrganicCatHealth() {
		// arrange
		VirtualPet underTest = new OrganicCat("Name", 0, 10, 0, 0, 0);
		// act
		int actual = underTest.getPetHealth();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void shouldGetRoboDogHealth() {
		// arrange
		VirtualPet underTest = new RoboDog("Name", 0, 10, 0);
		// act
		int actual = underTest.getPetHealth();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void shouldGetRoboCatHealth() {
		// arrange
		VirtualPet underTest = new RoboCat("Name", 0, 10, 0);
		// act
		int actual = underTest.getPetHealth();
		// assert
		assertEquals(10, actual);
	}

	@Test
	public void OrganicDogShouldFeed() {
		// arrange //name, happiness, health, hunger, thirst, waste
		OrganicDog underTest = new OrganicDog("Name", 0, 0, 5, 0, 0);
		// act
		underTest.feed();
		// assert
		assertEquals("Should be 0 having subtracted 5", 0, underTest.hunger, .5);
	}

	@Test
	public void OrganicDogShouldWater() {
		// arrange
		OrganicDog underTest = new OrganicDog("Name", 0, 0, 0, 5, 0);
		// act
		underTest.water();
		// assert
		assertEquals("Should be 0 having subtracted 5", 0, underTest.thirst, .5);
	}

	@Test
	public void OrganicDogShouldReduceWasteFromWalk() {
		// arrange
		OrganicDog underTest = new OrganicDog("Name", 0, 0, 0, 0, 5);
		// act
		underTest.walk();
		// assert
		assertEquals("Should be 0 having subtracted 5", 0, underTest.waste, .5);
	}

	@Test
	public void OrganicDogShouldReduceWasteFromCleaningCages() {
		// arrange
		OrganicDog underTest = new OrganicDog("Name", 0, 0, 0, 0, 5);
		// act
		underTest.cleanCages();
		// assert
		assertEquals("Should be 0 having subtracted 5", 0, underTest.waste, .5);
	}

	@Test
	public void RoboDogShouldAddMaintenanceFromOil() {
		// arrange
		RoboDog underTest = new RoboDog("Name", 0, 0, 0);
		// act
		underTest.oil();
		// assert
		assertEquals("Should be 5 having added 5 to 0", 0, underTest.maintenance, .5);
	}

	@Test
	public void RoboDogShouldTickHappiness() {
		// arrange
		RoboDog underTest = new RoboDog("Name", 1, 0, 0);
		// act
		underTest.tick();
		// assert
		assertEquals("Should be 0 having subtracted 1", 0, underTest.getPetHappiness(), .5);
	}

	@Test
	public void RoboDogShouldSubtractHealth() {
		// arrange
		RoboDog underTest = new RoboDog("Name", 0, 1, 0);
		// act
		underTest.tick();
		// assert
		assertEquals("Should be 0 having subtracted 1", 0, underTest.getPetHealth(), .5);
	}

	@Test
	public void OrganicCatShouldFeed() {
		// arrange //name, happiness, health, hunger, thirst, waste
		OrganicCat underTest = new OrganicCat("Name", 0, 0, 5, 0, 0);
		// act
		underTest.feed();
		// assert
		assertEquals("Should be 0 having subtracted 5", 0, underTest.hunger, .5);
	}

	@Test
	public void OrganicCatShouldWater() {
		// arrange
		OrganicCat underTest = new OrganicCat("Name", 0, 0, 0, 5, 0);
		// act
		underTest.water();
		// assert
		assertEquals("Should be 0 having subtracted 5", 0, underTest.thirst, .5);
	}

	@Test
	public void OrganicCatShouldReduceWasteFromCleaningLitterbox() {
		// arrange
		OrganicCat underTest = new OrganicCat("Name", 0, 0, 0, 0, 5);
		// act
		underTest.emptyLitterBox();
		// assert
		assertEquals("Should be 0 having subtracted 5", 0, underTest.waste, .5);
	}

	@Test
	public void RoboCatShouldAddMaintenanceFromOil() {
		// arrange
		RoboCat underTest = new RoboCat("Name", 0, 0, 0);
		// act
		underTest.oil();
		// assert
		assertEquals("Should be 5 having added 5 to 0", 0, underTest.maintenance, .5);
	}

	@Test
	public void RoboCatShouldTickHappiness() {
		// arrange
		RoboCat underTest = new RoboCat("Name", 1, 0, 0);
		// act
		underTest.tick();
		// assert
		assertEquals("Should be 0 having subtracted 1", 0, underTest.getPetHappiness(), .5);
	}

	@Test
	public void RoboCatShouldSubtractHealth() {
		// arrange
		RoboCat underTest = new RoboCat("Name", 0, 1, 0);
		// act
		underTest.tick();
		// assert
		assertEquals("Should be 0 having subtracted 1", 0, underTest.getPetHealth(), .5);
	}
}
