import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class problem11 {
  public static void main(String args[]) throws Exception {
    FileInputStream fStream = new FileInputStream("problem11.txt");
    int arr[][] = new int[20][20];
    int i = 0, j = 0;
    String row;
    BufferedReader br = new BufferedReader(new InputStreamReader(fStream));
    while ((row = br.readLine()) != null) {
      String mems[] = row.split(" ");
      j = 0;
      for (String mem : mems) {
        arr[i][j++] = Integer.parseInt(mem);
      }
      i++;
    }
    int product, productv = 0;
    for (i = 0; i < 20; i++) {
      for (j = 0; j < 16; j++) {
        product = arr[i][j] * arr[i][j + 1] * arr[i][j + 2] * arr[i][j + 3];
        if (product > productv) {
          productv = product;
        }
      }
    }
    int producth = 0;
    for (i = 0; i < 16; i++) {
      for (j = 0; j < 20; j++) {
        product = arr[i][j] * arr[i + 1][j] * arr[i + 2][j] * arr[i + 3][j];
        if (product > producth) {
          producth = product;
        }
      }
    }
    int productd1 = 0;
    for (i = 0; i < 16; i++) {
      for (j = 0; j < 16; j++) {
        product =
            arr[i][j] * arr[i + 1][j + 1] * arr[i + 2][j + 2]
                * arr[i + 3][j + 3];
        if (product > productd1) {
          productd1 = product;
        }
      }
    }
    int productd2 = 0;
    for (i = 3; i < 20; i++) {
      for (j = 0; j < 16; j++) {
        product =
            arr[i][j] * arr[i - 1][j + 1] * arr[i - 2][j + 2]
                * arr[i - 3][j + 3];
        if (product > productd2) {
          productd2 = product;
        }
      }
    }
    int a = Math.max(productv, producth);
    int b = Math.max(productd1, productd2);
    System.out.println(Math.max(a, b));
    br.close();
  }

}
