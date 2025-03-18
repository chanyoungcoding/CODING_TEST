package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 5522 ( 카드게임 )
 * 2025-03-18
 */
public class Bronze_5522 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;

        for(int i = 1; i <= 5; i++) {

            num += Integer.parseInt(br.readLine());
        }

        System.out.println(num);
    }
}
