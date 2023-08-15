import java.util.ArrayList;
import java.util.Collections;

public class collect {
  public static void printList(ArrayList<Double> list) {
    for (Double dubs : list) {
      System.out.println(dubs);
    }
  }

  public static void main(String[] args) {
    ArrayList<Double> dubList = new ArrayList<Double>();
    dubList.add(1.5);
    dubList.add(2.35);
    dubList.add(-4.7);
    dubList.add(0.01);
    System.out.println("Original List");
    printList(dubList);
    Collections.sort(dubList);
    System.out.println("Sorted List");
    printList(dubList);
    int index = Collections.binarySearch(dubList, 1.5);
    System.out.println("Found " + dubList.get(index) + " at index " + index);
    Collections.fill(dubList, 0.0);
    System.out.println("Zero List");
    printList(dubList);
  }
}