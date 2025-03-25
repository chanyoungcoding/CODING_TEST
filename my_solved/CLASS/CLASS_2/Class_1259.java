package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1259 ( 팰린드롬수 )
 * 2025-03-25
 */
public class Class_1259 {
	public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder result = new StringBuilder();

    while (true) {
      
      String str = br.readLine();
      int N = str.length();
      boolean good = true;
      
      if(str.equals("0")) break;

      for (int i = 0; i <= N / 2; i++) {
        if(str.charAt(i) != str.charAt(N - i - 1)) {
          good = false;
        }
      }

      if(good == true) {
        result.append("yes" + "\n");
      } else {
        result.append("no" + "\n");
      }

    }

    System.out.println(result);

  }
}
