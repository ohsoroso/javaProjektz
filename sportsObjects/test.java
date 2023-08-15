package sportsObjects;

public class test {
  public static void StartGame(athlete player) {
    System.out.println(player.toString());
    player.Play();
  }

  public static void main(String[] args) {
    bballPlayer MannyDangle = new bballPlayer("Manny", 21, "Vipers", "Center Field", "Right Handed", 4);
    bballPlayer DannyDore = new bballPlayer("Danny", 24, "Sauchs", "Left Field", "Left Handed", 2);

    fballPlayer ChadWick = new fballPlayer("Chad", 32, "Brons", "Quarterback", "Offense", 5);
    fballPlayer ThadBono = new fballPlayer("Thad", 29, "Mustangs", "Lineback", "Defense", 2);

    StartGame(MannyDangle);
    StartGame(DannyDore);
    StartGame(ChadWick);
    StartGame(ThadBono);
  }
}