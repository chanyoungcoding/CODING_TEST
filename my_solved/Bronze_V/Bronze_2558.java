package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 2475 ( A + B - 2)
 * 2025-03-17
 */
public class Bronze_2558 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(bf.readLine());
    int b = Integer.parseInt(bf.readLine());

    System.out.println(a + b);
  }
}
