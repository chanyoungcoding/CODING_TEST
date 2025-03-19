package CLASS.CLASS_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 10250 ( ACM 호텔 )
 * 2025-03-19
 */
public class Class_10250 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(bf.readLine()); // 테스트 케이스 개수

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < num; i++) {
      StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

      int H = Integer.parseInt(token.nextToken()); // 호텔 층 수
      int W = Integer.parseInt(token.nextToken()); // 각 층의 방 수 (사용 안 하더라도 입력받아야 함)
      int N = Integer.parseInt(token.nextToken()); // N번째 손님

      int floor, room;

      if (N % H == 0) { // 꼭대기 층에 배정되는 경우
        floor = H;
        room = N / H;
      } else {
        floor = N % H;
        room = (N / H) + 1;
      }

      result.append(floor * 100 + room).append("\n");
    }

    System.out.println(result);
  }
}

