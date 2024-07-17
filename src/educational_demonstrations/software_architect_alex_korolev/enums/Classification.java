package educational_demonstrations.software_architect_alex_korolev.enums;

public enum Classification {
	MAMMAL("Mammal"),
	BIRD("Bird"),
	REPTILE("Reptile"),
	FISH("Fish"),
	AMPHIBIAN("Amphibian"),
	INSECT("Insect");

	private final String stringValue;

	Classification(String stringValue) {
		this.stringValue = stringValue;
	}

	public String getStringValue() {
		return stringValue;
	}
}
