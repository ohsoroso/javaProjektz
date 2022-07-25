package animalObjects;

public class testAimalObj {
  public static void main(String[] args) {
    Dog d1 = new Dog(10, 5, 12, "Junior", "Pit");
    Cat c1 = new Cat(7, 8, 9, "Tobi", 9);
    Cat c2 = new Cat(6, 2, 10, "Uno", 5);
    Bird b1 = new Bird(2, 10, 3, 9.5, "Green Cheek Conure", true);

    System.out.println(d1.toString() + "\n");
    System.out.println(c1.toString() + "\n");
    System.out.println(c2.toString() + "\n");
    System.out.println(b1.toString());
  }
}