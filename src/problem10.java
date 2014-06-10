public class problem10 {
  public static void main(String args[]) throws Exception {
    long a, sum = 0;
    for (a = 2; a <= 2000000; a++) {
      if (isPrime(a)) {
        sum += a;
      }
    }
    System.out.println(sum);
  }

  public static boolean isPrime(long n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    long sqrtN = (long)Math.sqrt(n)+1;
    for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
  }
}
