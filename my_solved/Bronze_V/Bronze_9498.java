package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 9498 ( 시험성적 )
 * 2025-03-18
 */
public class Bronze_9498 {
      public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        if(score >= 90) {
          System.out.println("A");
        } else if(score >= 80) {
          System.out.println("B");
        } else if(score >= 70) {
          System.out.println("C");
        } else if(score >= 60) {
          System.out.println("D");
        } else {
          System.out.println("F");
        }
    }
}
