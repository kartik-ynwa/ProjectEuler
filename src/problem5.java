public class problem5 {
  public static void main(String args[]) throws Exception {
    long a = 20;
    while (!(czech(a++))) {
    }
    System.out.println(a - 1);
  }

  public static boolean czech(long a) {
    for (long b = 1; b <= 20; b++) {
      if (a % b != 0) {
        return false;
      }
    }
    return true;

  }
}
