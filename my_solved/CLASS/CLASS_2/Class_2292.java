package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2292 ( 벌집 )
 * 2025-03-25
 */
public class Class_2292 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int count = 1; // 거리
    int range = 2; // 범위

    if (N == 1) {
        System.out.println(1);
    } else {
        while (range <= N) {
            range = range + (6 * count);
            count++;
        }
        System.out.println(count);
    }
  }
}

