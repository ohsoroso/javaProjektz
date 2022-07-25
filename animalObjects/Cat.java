package animalObjects;

public class Cat extends Animal {
  private String name;
  private int lives;

  public Cat(int weight, int age, int height, String name, int lives) {
    super(weight, age, height);
    SetName(name);
    SetLives(lives);
  }

  public void SetName(String name) {
    this.name = name;
  }

  public void SetLives(int lives) {
    this.lives = lives;
  }

  public String GetName() {
    return name;
  }

  public int getLives() {
    return lives;
  }

  public String toString() {
    return "I am a cat named " + name + " I have " + lives + " lives and " + super.toString();
  }
}
