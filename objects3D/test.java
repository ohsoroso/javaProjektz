package objects3D;

public class test {
  public static void main(String[] args) {
    shape3D cube = new cuboid(4, 2, 4);
    shape3D cylin = new cylinder(5, 7);
  
    if(cube.compareTo(cylin) >= 0) {
      System.out.println("The cuboid is bigger !");
    }
    else {
      System.out.println("The cylinder is bigger !");
    }
  }
}