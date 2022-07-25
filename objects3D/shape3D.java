package objects3D;

abstract public class shape3D implements Comparable <shape3D> {
  abstract public double volume();

  @Override
  public int compareTo(shape3D input) {
    if (this.volume() > input.volume()) {
      return 1;
    }
    else if(this.volume() < input.volume()) {
      return -1;
    }
    else return 0;
  }
}
