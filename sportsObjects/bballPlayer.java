package sportsObjects;

public class bballPlayer extends athlete {
  private String handiness;
  private int battingAvg;

  public bballPlayer(String name, int age, String team, String position, String handiness, int battingAvg) {
    super(name, age, team, position);
    this.handiness = handiness;
    this.battingAvg = battingAvg;
  }
  
  @Override
  public String toString() {
    return super.toString() + " I am " + handiness + ". My batting average is " + battingAvg;
  }

  @Override
  public void Play() {
    System.out.println("I hit the ball.");
  }
}
