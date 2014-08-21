import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.*;

public class problem22 {

  public static void main(String[] args) throws Exception {
    FileInputStream fs = new FileInputStream("names.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fs));
    Matcher name = Pattern.compile("\"([^,]*?)\"").matcher(br.readLine());
    ArrayList<String> names = new ArrayList<String>();
    while (name.find()) {
      System.out.println(name.group(1));
      names.add(name.group(1));
    }
    br.close();
    BigInteger a = new BigInteger("0"), nScore;
    Collections.sort(names);
    for (int i = 0; i < names.size(); i++) {
      nScore = new BigInteger(getScore(names.get(i)));
      System.out.println(nScore);
      nScore = nScore.multiply(new BigInteger(Integer.toString(i+1)));
      a = a.add(nScore);
    }
    System.out.println(a);
  }
  
  public static String getScore(String name) {
    int scr = 0;
    for (int i = 0; i < name.length(); i++){
      scr += 1 + (name.charAt(i) - 'A');
    }
    return Integer.toString(scr);
  }
}
