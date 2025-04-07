package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 10773 (제로) - ArrayList 활용 버전
 */
public class Class_10773_other {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());

      if (num == 0) {
        // 마지막 요소 제거
        if (!list.isEmpty()) {
          list.remove(list.size() - 1);
        }
      } else {
        list.add(num);
      }
    }

    // 합계 계산
    int sum = 0;
    for (int value : list) {
      sum += value;
    }

    System.out.println(sum);
  }
}
