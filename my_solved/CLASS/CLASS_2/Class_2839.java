package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2839 ( 설탕 배달 )
 * 2025-03-24
 */
public class Class_2839 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    int count = 0;

    while (num >= 0) {

      if(num % 5 == 0) {
        count += num / 5;
        System.out.println(count);
        return;
      }

      num -= 3;
      count++;
    }

    System.out.println(-1);
  }
}
