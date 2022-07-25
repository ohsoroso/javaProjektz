package animalObjects;

public class Bird extends Animal {
  private double wingspan;
  private String species;
  private boolean flyable;

  public Bird(int weight, int age, int height, double wingspan, String species, boolean flyable) {
    super(weight, age, height);
    SetWingspan(wingspan);
    SetSpecies(species);
    SetFlyable(flyable);
  }

  public void SetWingspan(double wingspan) {
    this.wingspan = wingspan;
  }

  public void SetSpecies(String species) {
    this.species = species;
  }

  public void SetFlyable(boolean flyable) {
    this.flyable = flyable;
  }

  public double GetWingspan() {
    return wingspan;
  }

  public String GetSpecies() {
    return species;
  }

  public boolean GetFlyable() {
    return flyable;
  }


  public String toString() {
    String bool;
    if (flyable == true) {
      bool = "can fly";
    }
    else bool = "cannot fly";
    return "I am a " + species + " with a wingspan of " + wingspan + " and I " + bool + "\nAlso, " + super.toString();
  }
}
