public class problem7 {

  public static void main(String args[]) throws Exception {
    long a = 2, prime = 0, n = 0;
    while (n != 10001) {
      if (isPrime(a)) {
        n++;
        prime = a;
      }
      a++;
    }
    System.out.println(prime);
    System.out.println(n);
  }

  public static boolean isPrime(long a) {
    long b = 2;
    for (; b < a; b++) {
      if (a % b == 0) {
        return false;
      }
    }
    return true;
  }

}
