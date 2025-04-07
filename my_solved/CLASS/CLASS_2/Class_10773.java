package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10773 ( 제로 )
 * 2025-04-07
 */
public class Class_10773 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int top = -1;
    int sum = 0;
    int[] result = new int[N];

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());

      if(num == 0) {
        top--;
      } else {
        top++;
        result[top] = num;
      }
    }

    for (int i = 0; i <= top; i++) {
      sum += result[i];
    }

    System.out.println(sum);

  }
}
