package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 - 11022 ( A + B - 8 )
 * 2025-03-19
 */
public class Bronze_11022 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(bf.readLine());
    StringBuilder result = new StringBuilder();

    for (int i = 1; i <= num; i++) {

      StringTokenizer token = new StringTokenizer(bf.readLine());

      int a = Integer.parseInt(token.nextToken());
      int b = Integer.parseInt(token.nextToken());

      String text = String.format("Case #%d: %d + %d = %d%n", i, a, b, a + b);

      result.append(text);
      
    }

    System.out.println(result);
  }
}
