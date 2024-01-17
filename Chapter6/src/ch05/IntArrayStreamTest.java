package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for (int num : arr) {
			System.out.println(num);
		}
		
		System.out.println();
		
//		Arrays.stream(arr).forEach(n -> System.out.println(n)); //forEach 는 하나씩 꺼낸다. ()안에 들어가는 행위를  
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n)); // stream은 소모성으로 한번 사용후 재사용이 불가하다. stream은 늘 재생성 하여 사용하여야 한다.
//		is. 불가
		
		int sum1 = Arrays.stream(arr).sum();
		System.out.println(sum1);
	}

}
