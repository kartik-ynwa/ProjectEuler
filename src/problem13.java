import java.io.*;


public class problem13 {
  public static void main(String args[]) throws Exception {
    FileInputStream fS = new FileInputStream("problem13.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fS));
    String nums[] = new String[100];
    String row;
    long sumd = 0;
    String sum = "";
    int n = 0, m, digit;
    while ((row = br.readLine()) != null) {
      nums[n++] = row;
    }
    for (n = 49; n >= 0; n--) {
      for (m = 0; m < 100; m++) {
        digit = Character.getNumericValue(nums[m].charAt(n));
        sumd += digit;
      }
      sum = (Long.toString((sumd % 10))) + sum;
      sumd = sumd / 10;
    }
    sum = (Long.toString((sumd))) + sum;
    System.out.println(sum);
    br.close();
  }

}