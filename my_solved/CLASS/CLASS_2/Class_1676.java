package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1676 ( 팩토리얼 0의 개수 )
 * 2025-03-23
 */
public class Class_1676 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
		int count = 0;

		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);

  }
}
