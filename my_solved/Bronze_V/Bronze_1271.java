package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * 백준 - 1271 ( 엄청난 부자2 )
 * 2025-03-17
 */
public class Bronze_1271 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(bf.readLine());

    BigInteger a = new BigInteger(token.nextToken());
    BigInteger b = new BigInteger(token.nextToken());

    System.out.println(a.divide(b));
    System.out.println(a.remainder(b));

  }
}
