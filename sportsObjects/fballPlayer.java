package sportsObjects;

public class fballPlayer extends athlete {
  private String specialty;
  private int ringCount;

  public fballPlayer(String name, int age, String team, String position, String specialty, int ringCount) {
    super(name, age, team, position);
    this.specialty = specialty;
    this.ringCount = ringCount;
  }
  
  @Override
  public String toString() {
    return super.toString() + " My specialty is " + specialty + " and I have " + ringCount + " Super Bowl rings.";
  }

  @Override
  public void Play() {
    System.out.println("I ran 10 yards.");
  }
}