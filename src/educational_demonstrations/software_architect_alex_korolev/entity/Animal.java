package educational_demonstrations.software_architect_alex_korolev.entity;

import educational_demonstrations.software_architect_alex_korolev.enums.Classification;

public class Animal {
	private final String name;
	private final Classification classification;
	private final double age;

	public Animal(String name, Classification classification, double age) {
		this.name = name;
		this.classification = classification;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Classification getClassification() {
		return classification;
	}

	public double getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Animal { \n\tname: " + name + " \n\tclassification: " + classification.getStringValue() + " \n\tage: " + age + " \n}";
	}

}
