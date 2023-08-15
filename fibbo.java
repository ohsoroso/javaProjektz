public class fibbo extends Thread {
  static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    static int fib2(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public void run() {
      int n = 40;
      long bTime = System.currentTimeMillis();
      fibbo.fib(n);
      long aTime = System.currentTimeMillis();
      long nTime = aTime - bTime;
      System.out.printf("Recursive thread took: %d miliseconds\n", nTime);
    }
 
    public static void main(String args[]) {
        (new fibbo()).start();
        int n = 40;
        long bTime = System.currentTimeMillis();
        fib2(n);
        long aTime = System.currentTimeMillis();
        long nTime = aTime - bTime;
        System.out.printf("Dynamic thread took: %d miliseconds \n", nTime);
    }
}