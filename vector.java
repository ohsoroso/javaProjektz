public class vector {
  public static double x;
  public static double y;
  public static double z;

  vector(double xn,double yn,double zn) {
    x = xn;
    y = yn;
    z = zn;
  }

  vector() {
    x = 0.0;
    y = 0.0;
    z = 0.0;
  }

  @Override
  public String toString() {
    String veccy = x + "," + y + "," + z;
    return veccy;
  }

  public double Magnitude() {
    double vecto = Math.sqrt(x * x + y * y + z * z);
    System.out.printf("%.3f\n", vecto);
    return vecto;
  }

  public static void main(String[] args) {
    vector myVecto = new vector(1, 2, 3);
    myVecto.Magnitude();
    System.out.println(myVecto);
  }
}
