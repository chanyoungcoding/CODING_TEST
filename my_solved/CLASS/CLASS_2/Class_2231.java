package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2231 ( 분해합 )
 * 2025-03-24
 */
public class Class_2231 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // N 입력

    int result = 0;

    for (int i = 0; i < N; i++) {
      int sum = i;
      int temp = i;

      // 자릿수 합을 구함
      while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
      }

      // 분해합이 N이면, i가 생성자
      if (sum == N) {
        result = i;
        break;
      }
    }

    // 생성자가 없다면 0을 출력
    System.out.println(result);
  }
}
