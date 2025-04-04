package CLASS.CLASS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 10814 ( 나이순 정렬 )
 * 2025-04-04
 */
public class Class_10814 {
	public static void main(String[] args) throws IOException {		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Person[] person = new Person[N];

		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			person[i] = new Person(age, name);
		}

		// 타입을 Person 으로 둘 것.
		Arrays.sort(person, new Comparator<Person>() {
			// 나이순으로 정렬
			@Override
			public int compare(Person s1, Person s2) {
				return s1.age - s2.age;
			}
			
		});

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < N; i++) {
			// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
			sb.append(person[i]);
		}
		System.out.println(sb);
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
