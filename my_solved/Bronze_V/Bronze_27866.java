package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 27866 ( 문자와 문자열 )
 * 2025-03-19
 */
public class Bronze_27866 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();
    int num = Integer.parseInt(bf.readLine());

    System.out.println(str.charAt(num - 1));
  }
}
