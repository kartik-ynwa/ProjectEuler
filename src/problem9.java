public class problem9 {
  public static void main(String args[]) throws Exception {
    long a, b, c, d;
    for (a = 2; a <= 500; a++) {
      for (b = 2; b <= a; b++) {
        c = 1000000 + 2 * a * b - 2000 * a - 2000 * b;
        if (c == 0) {
          d = 1000 - a - b;
          System.out.format(
              "a = %d\nb = %d\nc = %d\na^2 + b^2 = %d\nc^2 = %d\nabc = %d\n",
              b, a, d, (a * a + b * b), (d * d), (a * b * d));
          System.exit(0);
        }
      }
    }
  }
}
