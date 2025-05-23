package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2775 ( 부녀회장이 될테야 )
 * 2025-03-25
 */
public class Class_2775 {

  public static int[][] APT = new int[15][15];
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		make_APT();	// 아파트 만들기 
		
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append('\n');
		}
		System.out.println(sb);
	}

	public static void make_APT() {

		// 아파트 생성
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1; // i층 1호
			APT[0][i] = i; // 0층 i호
		}

		for (int i = 1; i < 15; i++) { // 1층부터 14층까지

			for (int j = 2; j < 15; j++) { // 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}
}
