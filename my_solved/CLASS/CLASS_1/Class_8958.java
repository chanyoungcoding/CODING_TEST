package CLASS.CLASS_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8958 ( OX 퀴즈 )
 * 2025-03-19
 */
public class Class_8958 {

  public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int total = Integer.parseInt(bf.readLine());

    int a = 0;

    StringBuilder answer = new StringBuilder();

    while (a < total) {

      String[] str = bf.readLine().split("");

      int result = 0;
      int num = 1;

      for (int i = 0; i < str.length; i++) {
        if(str[i].equals("O")) {
          result += num;
          num++;
        } else {
          num = 1;
        }
      }

      answer.append(result + "\n");
      a++;
    }

    System.out.println(answer);
  }
}
