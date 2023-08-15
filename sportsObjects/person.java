package sportsObjects;

public class person {
  private String name;
  private int age;

  public person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "I am " + name + "and I am " + age + " years old.";
  }
}
