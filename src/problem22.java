import java.io.*;
import java.util.Arrays;

public class problem22 {

  public static void main(String[] args) throws Exception {
    FileInputStream fs = new FileInputStream("names.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fs));
    int numNames = 0;
    String row;
    while ((row = br.readLine()) != null) {
      numNames++;
    }
    fs = new FileInputStream("names.txt");
    br = new BufferedReader(new InputStreamReader(fs));
    String[] names = new String[numNames];
    int i = 0;
    while ((row = br.readLine()) != null) {
      names[i++] = row;
    }
    // TODO Sort and everything else
  }
}
