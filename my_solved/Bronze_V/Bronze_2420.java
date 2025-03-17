package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 - 2420 ( 사파리 월드 )
 * 2025-03-17
 */
public class Bronze_2420 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(bf.readLine());

    long a = Long.parseLong(token.nextToken());
    long b = Long.parseLong(token.nextToken());

    System.out.println(Math.abs(a-b));
  }
}
