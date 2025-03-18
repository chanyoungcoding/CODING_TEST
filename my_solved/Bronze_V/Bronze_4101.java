package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 - 4101 ( 크냐? )
 * 2025-03-18
 */
public class Bronze_4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;  //a, b 둘다 0이면 loop 종료

            if (a > b) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }

        }

        System.out.print(sb);
    }
}
