package educational_demonstrations.software_architect_alex_korolev.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import educational_demonstrations.software_architect_alex_korolev.entity.Animal;
import educational_demonstrations.software_architect_alex_korolev.enums.Classification;

public class Main {
	public static void main(String[] args) {
		List<Animal> animals = initListOfAnimals();

		// filterInsects(animals);
		// sortedByAge(animals);
	}

	@SuppressWarnings(value = "unused")
	private static void sortedByAge(List<Animal> animals) {
		List<Animal> sortedByAgeListOfAnimals = animals.stream().sorted(Comparator.comparing(Animal::getAge))
				.collect(Collectors.toList());
		sortedByAgeListOfAnimals.forEach(System.out::println);
	}

	@SuppressWarnings(value = "unused")
	private static void filterInsects(List<Animal> animals) {
		List<Animal> insects = animals.stream()
				.filter(animal -> animal.getClassification().equals(Classification.INSECT))
				.collect(Collectors.toList());

		insects.forEach(System.out::println);
	}

	@SuppressWarnings(value = "unused")
	private static void oldFashionedWayToFilterListOfObjects(List<Animal> animals) {
		List<Animal> animals_mammal = new ArrayList<Animal>();

		for (Animal animal : animals) {
			if (animal.getClassification() == Classification.MAMMAL) {
				animals_mammal.add(animal);
			}
		}

		for (Animal animal : animals_mammal) {
			System.out.println(animal);
		}
	}

	private static List<Animal> initListOfAnimals() {
		List<Animal> animals = new ArrayList<>();

		animals.add(new Animal("Lion", Classification.MAMMAL, 5));
		animals.add(new Animal("Elephant", Classification.MAMMAL, 8));
		animals.add(new Animal("Hawk", Classification.BIRD, 3));
		animals.add(new Animal("Shark", Classification.FISH, 12));
		animals.add(new Animal("Crocodile", Classification.REPTILE, 10));
		animals.add(new Animal("Frog", Classification.AMPHIBIAN, 2));
		animals.add(new Animal("Butterfly", Classification.INSECT, 1));
		animals.add(new Animal("Penguin", Classification.BIRD, 4));
		animals.add(new Animal("Dolphin", Classification.MAMMAL, 6));
		animals.add(new Animal("Turtle", Classification.REPTILE, 50));
		animals.add(new Animal("Goldfish", Classification.FISH, 1));
		animals.add(new Animal("Tiger", Classification.MAMMAL, 7));
		animals.add(new Animal("Eagle", Classification.BIRD, 5));
		animals.add(new Animal("Snake", Classification.REPTILE, 3));
		animals.add(new Animal("Newt", Classification.AMPHIBIAN, 4));
		animals.add(new Animal("Ant", Classification.INSECT, 1));
		animals.add(new Animal("Whale", Classification.MAMMAL, 20));
		animals.add(new Animal("Parrot", Classification.BIRD, 2));
		animals.add(new Animal("Lizard", Classification.REPTILE, 1));
		animals.add(new Animal("Salamander", Classification.AMPHIBIAN, 3));
		animals.add(new Animal("Aardvark", Classification.MAMMAL, 5));
		animals.add(new Animal("Quokka", Classification.MAMMAL, 3));
		animals.add(new Animal("Kakapo", Classification.BIRD, 4));
		animals.add(new Animal("Axolotl", Classification.AMPHIBIAN, 6));
		animals.add(new Animal("Coelacanth", Classification.FISH, 65));
		animals.add(new Animal("Tuataras", Classification.REPTILE, 50));
		animals.add(new Animal("Goliath Beetle", Classification.INSECT, 1));
		animals.add(new Animal("Saiga", Classification.MAMMAL, 8));
		animals.add(new Animal("Snowy Owl", Classification.BIRD, 9));
		animals.add(new Animal("Glass Frog", Classification.AMPHIBIAN, 2));

		return animals;
	}
}
