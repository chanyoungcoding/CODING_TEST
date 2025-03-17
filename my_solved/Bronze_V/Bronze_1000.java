package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 백준 - 1000
 * 2025-03-17
 */
public class Bronze_1000 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine());

		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());

		System.out.println(a + b);
	}
}