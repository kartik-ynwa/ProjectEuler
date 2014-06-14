import java.io.*;

public class problem18 {

  public static boolean isPrime(int n) {
    return !new String(new char[n]).matches(".?|(..+?)\\1+");
  }

  public static void main(String args[]) throws Exception {
    int arr[][] = new int[15][];
    for (int i = 1; i <= 15; i++) {
      arr[i - 1] = new int[i];
    }
    FileInputStream fs = new FileInputStream("problem18.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fs));
    String row;
    String nums[];
    int i = 0, j;
    while ((row = br.readLine()) != null) {
      nums = row.split(" ");
      j = 0;
      for (String n : nums) {
        arr[i][j++] = Integer.parseInt(n);
      }
      i++;
    }
    br.close();
    for (i = 13; i >= 0; i--) {
      for (j = 0; j <= i; j++) {
        arr[i][j] =
            Math.max(arr[i][j] + arr[i + 1][j], arr[i][j] + arr[i + 1][j + 1]);
      }
    }
    System.out.println(arr[0][0]);
  }
}
