public class problem2 {
  public static void main(String args[]) throws Exception {
    int b = 1, fib = 1, sum = 0, a;
    while (fib <= 4000000) {
      if (fib % 2 == 0) {
        sum += fib;
      }
      a = fib;
      fib += b;
      b = a;
    }
    System.out.println(sum);
  }

}
