package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 2744 (대소문자 바꾸기)
 * 2025-03-17
 */
public class Bronze_2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine(); // 전체 입력 받기
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) { // 문자 하나씩 확인
            if (Character.isLowerCase(ch)) { // 소문자면 대문자로 변환
                result.append(Character.toUpperCase(ch));
            } else { // 대문자면 소문자로 변환
                result.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(result);
    }
}
