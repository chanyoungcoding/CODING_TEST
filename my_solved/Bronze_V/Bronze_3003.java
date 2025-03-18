package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 - 3003 ( 킹, 퀸, 룩, 비숍, 나이트, 폰 )
 * 2025-03-17
 */
public class Bronze_3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer token = new StringTokenizer(bf.readLine());

        int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;

        king = king - Integer.parseInt(token.nextToken());
        queen = queen - Integer.parseInt(token.nextToken());
        rook = rook - Integer.parseInt(token.nextToken());
        bishop = bishop - Integer.parseInt(token.nextToken());
        knight = knight - Integer.parseInt(token.nextToken());
        pawn = pawn - Integer.parseInt(token.nextToken());

        System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
    }
}
