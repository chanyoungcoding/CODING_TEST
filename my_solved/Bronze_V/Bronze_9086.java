package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 9086 ( 문자열 )
 * 2025-03-18
 */
public class Bronze_9086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num; i++) {

            String str = br.readLine();

            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);

            System.out.println(String.valueOf(first) + String.valueOf(last));
        }
    }
}
