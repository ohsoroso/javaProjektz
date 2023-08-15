import java.util.*;
import java.util.ArrayList;

public class fac {
  static ArrayList<Integer> facList = new ArrayList<Integer>();
  public static void findFac(int n) {
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        facList.add(i);
      }
    }
    for (Integer integer : facList) {
      System.out.printf("%d ", integer);
    }
  }
  public static void smolFac(ArrayList<Integer> arrList, int n) {
    ArrayList<Integer> newList = new ArrayList<>();
    while (n != 1) {
      int i = 1;
      boolean nextDivF = false;
      while (nextDivF == false) {
        if (n % arrList.get(i) == 0) {
          nextDivF = true;
          newList.add(arrList.get(i));
          n = n / arrList.get(i);
        }
        else {
          i++;
        }
      }
    }
    for (Integer integer : newList) {
      System.out.printf("%d ", integer);
    }
  }
  public static void main(String[] args) {
    System.out.println("Enter n: ");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    findFac(n);
    System.out.println();
    smolFac(facList, n);
    scan.close();
  }
}