import java.util.Scanner;
public class pyram {

  public static void pyramidMaker(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    System.out.println("Welcome to pyramid world !");
    System.out.println("How big should this pyramid be my dude ?");

    Scanner pSize = new Scanner(System.in);
    int pyra = pSize.nextInt();

    pyramidMaker(pyra);

    
    pSize.close();
  }
}