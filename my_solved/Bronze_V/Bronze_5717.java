package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 - 5717 ( 상근이의 친구들 )
 * 2025-03-18
 */
public class Bronze_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            if(a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);

        }
    }
}
