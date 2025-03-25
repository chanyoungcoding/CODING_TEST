package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2798 ( 블랙잭 )
 * 2025-03-25
 */
public class Class_2798 {
	public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer token = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(token.nextToken());
    int M = Integer.parseInt(token.nextToken());

    int sum = 0;
    int tmp = 0;

    token = new StringTokenizer(br.readLine());
    int[] arr = new int[N];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(token.nextToken());
    }

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        for (int k = j + 1; k < N; k++) {
          sum = arr[i] + arr[j] + arr[k];

          if(tmp < sum && sum <= M) {
            tmp = sum;
          }
        }
      }
    }

    System.out.println(tmp);

  }
}
