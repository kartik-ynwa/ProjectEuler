public class problem16 {

  public static void main(String args[]) throws Exception {
    String n = "1";
    for (int a = 1; a <= 1000; a++) {
      n = mult2(n);
    }
    int len = n.length(), sum = 0;
    for (int a = 0; a < len; a++){
      sum += Character.getNumericValue(n.charAt(a));
    }
    System.out.println(sum);
  }

  public static String mult2(String num) {
    int len = num.length(), carry = 0, digit;
    String ans = "";
    for (int a = len - 1; a >= 0; a--) {
      digit = Character.getNumericValue(num.charAt(a));
      digit = digit * 2;
      digit = digit + carry;
      ans = Integer.toString(digit % 10) + ans;
      carry = digit / 10;
    }
    if (carry != 0) {
      ans = Integer.toString(carry) + ans;
    }
    return ans;
  }

}
