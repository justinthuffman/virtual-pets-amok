package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {

		VirtualPet pets = new OrganicDog("Griffin", 10, 10, 0, 0, 0);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		myShelter.addPet(pets);

		VirtualPet roboDog = new RoboDog("Travis", 10, 10, 10);
		myShelter.addPet(roboDog);

		VirtualPet organicCat = new OrganicCat("Justin", 10, 10, 0, 0, 0);
		myShelter.addPet(organicCat);

		VirtualPet roboCat = new RoboCat("Clint", 10, 10, 10);
		myShelter.addPet(roboCat);

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to My Pet, My Pet, and Me, Animal Shelter.");

		String showMenu = "\n\t	Please choose an option: \n" + "\n\t" + "  1. Feed organic pets\n\t"
				+ "  2. Water organic pets\n\t" + "  3. Clean the dog cages.\n\t" + "  4. Clean the litter box.\n\t"
				+ "  5. Walk the dogs.\n\t" + "  6. Oil Robo Pets. \n\t" + "  7. Adopt a pet\n\t"
				+ "  8. Admit a pet\n\t" + "  9. Play with a pet \n\t" + " 10. Show pets in shelter\n\t" + " 11. Quit";
		String userChoice;
		while (myShelter.hasPets()) {
			do {
				System.out.println(showMenu);
				userChoice = input.nextLine();
				switch (userChoice) {
				// Feed all organic animals.
				case "1":
					myShelter.tickAllPets(pets);
					myShelter.feedPets();
					System.out.println("The organic pets all seem happy and full.");
					break;
				// Water all organic animals.
				case "2":
					myShelter.tickAllPets(pets);
					myShelter.waterAllPets();
					System.out.println("You watered all organic pets in the shelter.");
					break;
				// Clean all dog cages.
				case "3":
					myShelter.tickAllPets(pets);
					myShelter.cleanAllCages();
					System.out.println("The dog cages have all been cleaned.");
					break;
				// Clean cats' litter box.
				case "4":
					myShelter.tickAllPets(pets);
					myShelter.emptyLitterBox();
					System.out.println("The litter has been replaced in the cats' litter box.");
					break;
				// Walk all dogs.
				case "5":
					myShelter.tickAllPets(pets);
					myShelter.walkDogs();
					System.out.println("You took the dogs for a walk.");
					break;
				// Oil all robo pets.
				case "6":
					myShelter.tickAllPets(pets);
					myShelter.oilAllRobots();
					System.out.println("All robo parts in robo pets have been oiled.");
					break;
				// Pet adoption.
				case "7":
					myShelter.tickAllPets(pets);
					myShelter.showPets(pets);
					System.out.println("Who would you like to adopt?");
					String upForAdoption = input.nextLine();
					myShelter.removePet(upForAdoption);
					System.out.println("You have adopted " + upForAdoption);
					break;
				// Add a pet.
				case "8":
					myShelter.tickAllPets(pets);
					System.out.println(
							"Do you have a: \n\t A. Organic Dog \n\t B. Organic Cat \n\t C. Robot Dog \n\t D. Robot Cat");
					String petType = input.nextLine();
					switch (petType.toUpperCase()) {
					// Add organic dog.
					case "A":
						System.out.println("Please name the new dog: ");
						String organicDogName = input.nextLine();
						VirtualPet newOrganicDog = new OrganicDog(organicDogName, 10, 10, 0, 0, 0);
						myShelter.addPet(newOrganicDog);
						break;
					// Add organic cat.
					case "B":
						System.out.println("Please name the new cat: ");
						String organicCatName = input.nextLine();
						VirtualPet newOrganicCat = new OrganicCat(organicCatName, 10, 10, 0, 0, 0);
						myShelter.addPet(newOrganicCat);
						break;
					// Add robo dog.
					case "C":
						System.out.println("Please name the new robot dog: ");
						String roboDogName = input.nextLine();
						VirtualPet newRoboDog = new RoboDog(roboDogName, 10, 10, 10);
						myShelter.addPet(newRoboDog);
						break;
					// Add robo cat.
					case "D":
						System.out.println("Please name the new robot cat: ");
						String roboCatName = input.nextLine();
						VirtualPet newRoboCat = new RoboCat(roboCatName, 10, 10, 10);
						myShelter.addPet(newRoboCat);
						break;
					}
					System.out.println("Congratulations! You've got a new friend!");
					break;
				case "9": // play with a pet
					myShelter.tickAllPets(pets);
					System.out.println("Which pet would you like to play with?");
					System.out.println();
					myShelter.showPetName(pets);
					String chosenPet = input.nextLine();
					VirtualPet playPet = myShelter.getPetNamed(chosenPet);
					playPet.play();
					System.out.println(chosenPet + " had a great time!");
					break;
				case "10":
					myShelter.tickAllPets(pets);
					System.out.println("These are the pets in the shelter: ");
					myShelter.showPets(pets);
					break;
				case "11":
					System.out.println("See you next time!");
					System.exit(0);
					break;
				default:
					System.out.println("Not an option. Try again.");
				}
			} while (!myShelter.hasPets());

		}

		input.close();
	}
}
