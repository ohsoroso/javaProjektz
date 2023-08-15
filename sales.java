public class sales {
  public static void main(String[] args) {
    double income = 0.00;
    while (income < 20000.00) {
      income += 1000.00;
      System.out.printf("%.2f", income);
      computeIncome(income);
    }
  }

  public static void computeIncome(double salesNum) {
    double salesTotal = 0.00;
    if (salesNum <= 5000) {
      salesTotal = salesNum * 0.08 + 5000;
    }
    else if (salesNum > 5000 && salesNum <= 10000) {
      salesTotal = salesNum * 0.1 + 4900;
    }
    else if (salesNum > 10000) {
      salesTotal = salesNum * 0.12 + 4700;
    }
    System.out.printf("\t %.2f \n", salesTotal);
  }
}