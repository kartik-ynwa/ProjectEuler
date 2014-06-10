public class problem14 {
  public static void main(String args[]) throws Exception {
    Double s;
    long a = 1000000 - 1;
    long b, maxnum = 0;
    int number, maxcount = 0, exp;
    while (a != 1) {
      b = a;
      number = 0;
      while (b != 1) {
        if (b % 2 == 0) {
          s = Math.log(b) / Math.log(2);
          if (s % 1 == 0) {
            exp = (int) Math.floor(s);
            number = number + exp;
            b = 1;
          } else {
            b = b / 2;
            number++;
          }
        } else {
          b = 3 * b + 1;
          number++;
        }
      }
      if (number > maxcount) {
        maxcount = number;
        maxnum = a;
      }
      a--;
    }
    System.out.println(maxnum + "\n" + maxcount);
  }
}
