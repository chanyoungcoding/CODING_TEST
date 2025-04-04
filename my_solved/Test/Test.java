package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    Person[] persons = new Person[N];

    for (int i = 0; i < N; i++) {
      int age = Integer.parseInt(br.readLine());
      String name = br.readLine();

      persons[i] = new Person(age, name);
    }

    Arrays.sort(persons, new Comparator<Person>() {
      
      @Override
      public int compare(Person s1, Person s2) {
        return s1.age - s2.age;
      }
    });

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < N; i++) {
      result.append(persons[i]);
    }

    System.out.println(result);

  }

  public static class Person {
  
    int age;
    String name;

    public Person(int age, String name) {
      this.age = age;
      this.name = name;
    }

    @Override
    public String toString() {
      return age + " " + name + "\n";
    }
    
  }
  
}
