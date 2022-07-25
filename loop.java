public class loop {
  public static void main(String[] args) {
    int sales = 5000;
    double commision = 0;

    do {
      System.out.printf("Current sales: %d ", sales);
      if (sales <= 10000) {
        commision = sales / 10;
      }
      else if (sales >= 10001 && sales <= 15000) {
        commision = (double) sales * 0.12;
      }
      else if (sales >= 15001) {
        commision = (double) sales * 0.15;
      }
      System.out.printf("\tCurrent commision: %.2f\n", commision);
      sales = sales + 1000;
    } while (sales != 21000);
  }
}