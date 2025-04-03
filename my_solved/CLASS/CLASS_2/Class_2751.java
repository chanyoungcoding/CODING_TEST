package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2751 ( 수 정렬하기 2 )
 * 2025-03-25
 */
public class Class_2751 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] result = new int[N];
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < N; i++) {
			result[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(result);

		for (int i = 0; i < N; i++) {
			answer.append(result[i] + "\n");
		}

		System.out.println(answer);

	}
}
