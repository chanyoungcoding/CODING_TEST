package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 10807 ( 개수 세기 )
 * 2025-03-18
 */
public class Bronze_10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); // 입력 개수
        String[] str = br.readLine().split(" ");  // 공백으로 구분된 숫자 배열
        String target = br.readLine();           // 찾고 싶은 숫자

        int count = 0; // 개수를 저장할 변수

        for (int i = 0; i < num; i++) {
            if (str[i].equals(target)) {  // target과 일치하면 count 증가
                count++;
            }
        }

        System.out.println(count); // 최종 개수 출력
    }
}

