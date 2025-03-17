package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 2438 ( 별찍기 - 1 )
 * 2025-03-17
 */
public class Bronze_2438 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(bf.readLine());

    for(int i = 1; i <= a; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
