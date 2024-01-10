package bronze4;

import java.util.Scanner;

public class SetMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int setFood = 2000;
		int setDrink = 2000;
		
		for (int i = 1; i <= 3; i++) {
			int food = sc.nextInt();
			if (setFood >= food) {
				setFood = food;
			}
		}
		
		for (int i = 1; i <= 2; i++) {
			int drink = sc.nextInt();
			if (setDrink >= drink) {
				setDrink = drink;
			}
			
		}
		System.out.println(setFood + setDrink - 50);
	}

}
