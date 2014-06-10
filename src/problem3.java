import java.math.BigInteger;

public class problem3 {

  public static void main(String args[]) throws Exception {
    long a = 600851475143L;
    /*
    long b = 2;
    long c;
    BigInteger d;
    for (; a != 1; b++) {
      d = BigInteger.valueOf(b);
      if (a % b == 0 && d.isProbablePrime(2)) {
        c = 1;
        while (a % (b ^ c) == 0) {
          c = c + 1;
        }
        a = a / (b ^ (c - 1));
      }
    }
    System.out.println(b - 1);
    */
    System.out.println(numFactors(a));
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
  
  public static int numFactors (long a){
    BigInteger d;
    int product = 1;
    int c;
    for (long b = 2; a != 1; b++) {
      d = BigInteger.valueOf(b);
      if (a % b == 0 && d.isProbablePrime(2)) {
        c = 1;
        while (a % (Math.pow(b, c)) == 0) {
          c = c + 1;
        }
        product = product * c;
        a = a /((long)(Math.pow(b, c - 1)));
      }
    }
    return product;
  }
}
