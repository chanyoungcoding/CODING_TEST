package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 2739 ( 구구단 )
 * 2025-03-17
 */
public class Bronze_2739 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(bf.readLine());

    for(int i = 1; i <= 9; i++) {
      System.out.println(a + " * " + i + " = " + (a * i));
    }

  }
}
