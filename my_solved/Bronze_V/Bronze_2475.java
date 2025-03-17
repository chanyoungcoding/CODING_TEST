package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 2475 ( 검증수 )
 * 2025-03-17
 */
public class Bronze_2475 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String[] str = bf.readLine().split(" ");

    int num = 0;

    for(int i = 0; i < str.length; i++) {
      num += Math.pow(Integer.parseInt(str[i]), 2);
    }

    System.out.println(num % 10);
  }
}
