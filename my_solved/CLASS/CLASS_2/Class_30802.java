package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 30802 ( 웰컴 키트 )
 * 2025-03-24
 */
public class Class_30802 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 참가자 수 입력
    int N = Integer.parseInt(br.readLine());

    // 티셔츠 개수 입력 (6가지 사이즈)
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] tshirtSizes = new int[6];

    for (int i = 0; i < 6; i++) {
      tshirtSizes[i] = Integer.parseInt(st.nextToken());
    }

    // 티셔츠 묶음 개수(T)와 펜 묶음 개수(P) 입력
    st = new StringTokenizer(br.readLine());
    int T = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());

    // ✅ 티셔츠 묶음 개수 계산
    int tshirtBundles = 0;
    for (int i = 0; i < 6; i++) {
      // (필요한 티셔츠 수 + T - 1) / T 를 통해 올림 처리하여 묶음 개수 계산
      tshirtBundles += (tshirtSizes[i] + T - 1) / T;
    }

    // ✅ 펜 묶음 개수 계산
    int penBundles = N / P; // 최대 몇 묶음을 주문할 수 있는지
    int remainingPens = N % P; // 추가로 필요한 펜 개수

    // 결과 출력
    System.out.println(tshirtBundles);
    System.out.println(penBundles + " " + remainingPens);
  }
}
