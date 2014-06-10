public class problem17 {
  public static void main(String args[]) throws Exception {
    String ones[] =
        {"", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine"};
    String teens[] =
        {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};
    String tens[] =
        {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety"};
    String repr;
    String num;
    String p1 = "", p2 = "";
    long sum = 0;
    for (int a = 999; a >= 100; a--) {
      num = Integer.toString(a);
      repr = "";
      p1 = "";
      p2 = "";
      p1 = p1 + num.charAt(0);
      p2 = p2 + num.charAt(1) + num.charAt(2);
      repr = repr + ones[Integer.parseInt(p1)] + "hundred";
      if (p2.equals("00")) {
      } else if (p2.charAt(0) == '1') {
        repr = repr + "and" + teens[Character.getNumericValue(p2.charAt(1))];
      } else {
        repr =
            repr + "and" + tens[Character.getNumericValue(p2.charAt(0))]
                + ones[Character.getNumericValue(p2.charAt(1))];
      }
      System.out.println(repr);
      sum = sum + repr.length();
    }
    for (int a = 99; a >= 10; a--) {
      repr = "";
      p2 = Integer.toString(a);
      if (p2.charAt(0) == '1') {
        repr = repr + teens[Character.getNumericValue(p2.charAt(1))];
      } else {
        repr =
            repr + tens[Character.getNumericValue(p2.charAt(0))]
                + ones[Character.getNumericValue(p2.charAt(1))];
      }
      System.out.println(repr);
      sum = sum + repr.length();
    }
    for (int a = 1; a <= 9; a++){
      sum += ones[a].length();
      System.out.println(ones[a]);
    }
    sum += "onethousand".length();
    System.out.println(sum);
  }

}
