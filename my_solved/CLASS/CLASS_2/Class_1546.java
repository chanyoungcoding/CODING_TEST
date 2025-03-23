package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1546 ( 평균 )
 * 2025-03-21
 */
public class Class_1546 {

  public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(bf.readLine());

    String[] str = bf.readLine().split(" ");

    int maxNum = Integer.MIN_VALUE;

    double result = 0;

    for (String strNum : str) {
      int value = Integer.parseInt(strNum);
      if (value > maxNum) {
        maxNum = value;
      }
    }

    for (String strNum : str) {
      int value = Integer.parseInt(strNum);
      result += (double) value / maxNum * 100;
    }

    System.out.println(result / num);

  }
}
