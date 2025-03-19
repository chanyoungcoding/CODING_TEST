package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 - 10871 ( X 보다 작은 수 )
 * 2025-03-19
 */
public class Bronze_10871 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(bf.readLine());

    String[] strArray = bf.readLine().split(" ");
    
    int a = Integer.parseInt(token.nextToken());
    int b = Integer.parseInt(token.nextToken());

    StringBuilder result = new StringBuilder();

    for(int i = 0; i < a; i++) {
      int num = Integer.parseInt(strArray[i]);
      if(num < b) {
        result.append(num + " ");
      }
    }

    System.out.println(result);
  }
}
