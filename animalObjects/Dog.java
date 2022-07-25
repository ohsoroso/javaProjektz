package animalObjects;

public class Dog extends Animal {
	
	private String name;
	private String breed;
	
	public Dog(int weight, int age, int height, String name, String breed) {
		super(weight, age, height);
		SetName(name);
		SetBreed(breed);
	}
	
	public void SetName(String name) {
		this.name = name;
	}

	public void SetBreed(String breed) {
		this.breed = breed;
	}
	
	public String GetName() {
		return name;
	}

	public String GetBreed() {
		return breed;
	}
	
	public String toString() {
		return "I am a " + breed + " named " + name + ".\nAlso, " + super.toString();
	}

}
