package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 4153 ( 직각 삼각형 )
 * 2025-03-23
 */
public class Class_4153 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      int z = Integer.parseInt(st.nextToken());

      // 0 0 0 을 입력받으면 종료
      if (x == 0 && y == 0 && z == 0)
        break;

      if ((x * x + y * y) == z * z) {
        System.out.println("right");
      } else if (x * x == (y * y + z * z)) {
        System.out.println("right");
      } else if (y * y == (z * z + x * x)) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}
