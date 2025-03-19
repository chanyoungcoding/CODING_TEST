package CLASS.CLASS_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2920 ( 음계 )
 * 2025-03-19
 */
public class Class_2920 {

  public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[] str = bf.readLine().split(" ");

    boolean isAscending = true;
    boolean isDescending = true;

    for(int i = 0; i < str.length; i++) {
      int num = Integer.parseInt(str[i]);

      if(num != i + 1) {
        isAscending = false;
      }

      if(num != 8 - i) {
        isDescending = false;
      }
    }

    if(isAscending) {
      System.out.println("ascending");
    } else if(isDescending) {
      System.out.println("descending");
    } else {
      System.out.println("mixed");
    }
  }
}
