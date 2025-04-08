package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      if(num == 0) {
        if(!result.isEmpty()) {
          result.remove(result.size() - 1);
        }
      } else {
        result.add(num);
      }
    }

    int sum = 0;

    for(int value : result) {
      sum += value;
    }

    System.out.println(sum);


  }

  
}
