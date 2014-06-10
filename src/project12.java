public class project12 {
  public static void main(String args[]) throws Exception {
    int d = 999, n; long a;
    do {
      a = (d*(d+1))/2;
      d++;
      n = problem3.numFactors(a);
    } while (n <= 500);
    System.out.println(a);
  }
}
