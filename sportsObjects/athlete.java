package sportsObjects;

public class athlete extends person {
  private String team, position;

  public athlete(String name, int age, String team, String position) {
    super(name, age);
    this.team = team;
    this.position = position;
  }

  @Override
  public String toString() {
    return super.toString() + " I play for the " + team + " and I am a " + position;
  }

  public void Play() {
    System.out.println("Played their sport.");
  }
}
