package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 백준 - 2338 ( 긴자리 계산 )
 * 2025-03-17
 */
public class Bronze_2338 {
  
  public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    BigInteger a = new BigInteger(bf.readLine());
    BigInteger b = new BigInteger(bf.readLine());

    System.out.println(a.add(b));
    System.out.println(a.subtract(b));
    System.out.println(a.multiply(b));
  }
}
