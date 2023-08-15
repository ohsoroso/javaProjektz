public class test extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Thread: " + i);
      try {
        sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

  public static void main(String[] args) {
    (new test()).start();
    for (int i = 1; i <= 20; i++) {
      System.out.println("Main function: " + i);
      try {
        sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }
}
