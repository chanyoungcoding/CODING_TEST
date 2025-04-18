package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2609 ( 최대, 최소공배수 )
 * 2025-03-25
 */
public class Class_2609 {
	public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int d = gcd(a, b);

    System.out.println(d);
    System.out.println(a * b / d);

  }

  // 최대공약수 반복문 방식
  public static int gcd(int a, int b) {

    while (b != 0) {
      int r = a % b; // 나머지를 구해준다.

      // GCD(a, b) = GCD(b, r)이므로 변환한다.
      a = b;
      b = r;
    }
    return a;
  }
}
