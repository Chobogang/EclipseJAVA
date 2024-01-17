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
		
//		Arrays.stream(arr).forEach(n -> System.out.println(n)); //forEach �� �ϳ��� ������. ()�ȿ� ���� ������  
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n)); // stream�� �Ҹ����� �ѹ� ����� ������ �Ұ��ϴ�. stream�� �� ����� �Ͽ� ����Ͽ��� �Ѵ�.
//		is. �Ұ�
		
		int sum1 = Arrays.stream(arr).sum();
		System.out.println(sum1);
	}

}
