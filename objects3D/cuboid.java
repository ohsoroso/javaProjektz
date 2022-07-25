package objects3D;

public class cuboid extends shape3D {
  private int width;
  private int height;
  private int depth;

  public cuboid(int width, int height, int depth) {
    setWidth(width);
    setHeight(height);
    setDepth(depth);
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setDepth(int depth) {
    this.depth = depth;
  }

  public int getWidth(int width) {
    return width;
  }

  public int getHeight(int height) {
    return height;
  }

  public int getDepth(int depth) {
    return depth;
  }

  public double volume() {
    return height * width * depth;
  }
}
