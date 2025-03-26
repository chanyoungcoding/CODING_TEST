package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2869 ( 달팽이는 올라가고 싶다 )
 * 2025-03-26
 */
public class Class_2869 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(br.readLine());

    int up = Integer.parseInt(token.nextToken());
    int down = Integer.parseInt(token.nextToken());
    int height = Integer.parseInt(token.nextToken());

    int day = (height - down) / (up - down);

    if((height - down) % (up - down) != 0) {
      day++;
    }

    System.out.println(day);

  }
}
