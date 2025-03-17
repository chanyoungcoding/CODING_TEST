package Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_1008 {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(bf.readLine());

    double a = Double.parseDouble(token.nextToken());
    double b = Double.parseDouble(token.nextToken());

    System.out.println(a / b);
  }
}
