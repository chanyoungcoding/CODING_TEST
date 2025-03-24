package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1978
 * 2025-03-24
 */
public class Class_1978 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); // 숫자 개수 입력
    StringTokenizer token = new StringTokenizer(br.readLine());
    
    int primeCount = 0; // 소수 개수

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(token.nextToken());
      if (isPrime(num)) {
        primeCount++;
      }
    }

    System.out.println(primeCount);
  }

  // 소수 판별 함수
  public static boolean isPrime(int num) {
    if (num < 2) return false; // 1은 소수가 아님

    for (int i = 2; i * i <= num; i++) { // √num까지만 검사
      if (num % i == 0) return false; // 나누어떨어지면 소수가 아님
    }
    
    return true; // 소수임
  }
}

