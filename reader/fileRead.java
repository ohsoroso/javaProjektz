package reader;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class fileRead {
  public static void sorter(int arry[]) {
    Arrays.sort(arry);
    for (int i = 0; i < arry.length; i++) {
      System.out.println(arry[i]);
    }
  }

  public static void main(String[] args) throws IOException
    {
      try {
        File file = new File("reader//data.txt");
        Scanner input = new Scanner(file);
        int n = input.nextInt();
        int i=0;
        int[] integers = new int [n];
          while(input.hasNext())
          {
              integers[i] = input.nextInt();
              i++;
          }
            sorter(integers);
            input.close();
          }
          catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}