
public class problem6 {
  public static void main(String args[]) throws Exception{
    long sum1 = 0, sum2 = 0, a;
    for (a = 1; a <= 100; a++){
      sum1 += a*a;
      sum2 += a;
    }
    sum2 = sum2*sum2;
    System.out.println(sum2 - sum1);
  }

}
