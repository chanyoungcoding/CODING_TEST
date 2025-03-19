package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 - 10952 ( A + B - 5 )
 * 2025-03-19
 */
public class Bronze_10952 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder result = new StringBuilder();

    while (true) {
      
      StringTokenizer str = new StringTokenizer(bf.readLine());

      int a = Integer.parseInt(str.nextToken());
      int b = Integer.parseInt(str.nextToken());

      if(a == 0 && b == 0) {
        break;
      }

      result.append((a + b) + "\n");
    }

    System.out.println(result);
  }
}
