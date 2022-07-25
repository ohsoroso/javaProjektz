package objects3D;

public class cylinder extends shape3D {
  private int radius;
  private int height;

  public cylinder(int radius, int height) {
    setRadius(radius);
    setHeight(height);
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getRadius(int radius) {
    return radius;
  }

  public int getHeight(int height) {
    return height;
  }

  public double volume() {
    return Math.PI * radius * radius * height;
  }
}
