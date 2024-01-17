package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t")); // 중간연산 sort : 내림차순
		System.out.println();
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t")); // 중간연산 map : 특정함수의 변환(문자열의 길이, n*n과 같이)
		System.out.println();
		sList.stream().map(s -> s.length() >= 5).forEach(n -> System.out.print(n + "\t")); // 중간연산 map : 문자열의 길이
		System.out.println();
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s)); // 중간연산 filter : 조건에 맞는 요소만 남긴다.

//		최종 연산
//		forEach() : 요소를 하나씩 꺼내 옴
//		count() : 요소의 개수
//		sum() : 요소들의 합
	}

}
