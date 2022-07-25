import java.util.Scanner;
public class hello {

  public static void main(String[] args) {
    System.out.println("Enter number: \n");
    Scanner myNum = new Scanner(System.in);
    int num = myNum.nextInt();
    double myDouble = num;

    System.out.printf("You entered: %d\n", num);
    System.out.printf("Times three: %d\n", num * 3);
    System.out.printf("Divided by three: %f\n",  myDouble / 3);

    myNum.close();
  }
}