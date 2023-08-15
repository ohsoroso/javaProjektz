

public class minimum {
  public static <E extends Comparable<E>> E min (E[] list) {
    E minElement = list[0];
    for(int i = 0; i < list.length; i++) {
      if (list[i].compareTo(minElement) <= 0) {
        minElement = list[i];
      }
    }
    return minElement;
  }

  public static void main(String[] args) {
    String[] colors = {"Red","Green","Blue"};
    Integer[] numbers = {1, 2, 3};
    Double[] circleRadius = {3.0, 5.9, 2.9};
    System.out.println(min(colors));
    System.out.println(min(numbers));
    System.out.println(min(circleRadius));
  }
}