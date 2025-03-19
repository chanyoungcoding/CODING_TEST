package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 10950 ( A + B - 3 )
 * 2025-03-19
 */
public class Bronze_10950 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(bf.readLine());

    StringBuilder result = new StringBuilder();

    for(int i = 0; i < num; i++) {
      String[] str = bf.readLine().split(" ");

      int a = Integer.parseInt(str[0]);
      int b = Integer.parseInt(str[1]);

      result.append((a + b) + "\n");
    }

    System.out.println(result);

  }
}
