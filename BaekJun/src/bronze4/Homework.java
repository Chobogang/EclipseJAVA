package bronze4;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int holiday = sc.nextInt();
		int mathPage = sc.nextInt();
		int koreaPage = sc.nextInt();
		int m_quota = sc.nextInt();
		int k_quota = sc.nextInt();
		
		if(mathPage%m_quota != 0) {
			mathPage = mathPage/m_quota + 1;
		} else mathPage /= m_quota;
		


		if(koreaPage%k_quota != 0) {
			koreaPage = koreaPage/k_quota + 1;
		} else koreaPage /= k_quota;
		
		if(mathPage >= koreaPage) {
			System.out.println(holiday - mathPage);
		} else System.out.println(holiday - koreaPage);
	}

}
