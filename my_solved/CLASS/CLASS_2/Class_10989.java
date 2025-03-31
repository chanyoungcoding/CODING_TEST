package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10989 ( 수 정렬하기 3 )
 * 2025-03-31
 */
public class Class_10989 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] arrays = new int[N];

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < N; i++) {
      arrays[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(arrays);

    for (int i = 0; i < N; i++) {
      result.append(arrays[i] + "\n");
    }

    System.out.println(result);
  }
}
