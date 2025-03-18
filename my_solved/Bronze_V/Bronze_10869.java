package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 - 10869 ( 사칙 연산 )
 * 2025-03-18
 */
public class Bronze_10869 {
    public static void main(String[] args) throws IOException {
		
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer token = new StringTokenizer(bf.readLine());
        
		int A = Integer.parseInt(token.nextToken());
		int B = Integer.parseInt(token.nextToken());

		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
}


