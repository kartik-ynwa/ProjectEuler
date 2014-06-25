import java.lang.reflect.Array;

public class problem21 {

  public static void main(String[] args) {
    int[] sumdiv = new int[9999];
    for (int i = 1; i < 10000; i++){
      sumdiv[i-1] = sumOfDivisors(i);
    }
    boolean isAmicable[] = new boolean[9999];
    Array.set(isAmicable, 0, false);
    for (int i = 0; i < 9999; i++){
      for (int j = i+1; j < 9999; j++){
        if (sumdiv[i] == (j+1) && sumdiv[j] == (i+1)){
          isAmicable[i] = true;
          isAmicable[j] = true;
        }
      }
    }
    int sum = 0;
    for (int i = 0; i < 9999; i++){
      if(isAmicable[i]){
        sum += i+1;
      }
    }
    System.out.print(sum);
  }
  
  public static int sumOfDivisors(int num){
    int sum = 0;
    for (int i = 1; i < num; i++){
      if (num % i == 0){
        sum = sum + i;
      }
    }
    return sum;
  }

}
