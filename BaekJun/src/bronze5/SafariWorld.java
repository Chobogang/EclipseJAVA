package bronze5;

import java.math.BigInteger;
import java.util.Scanner; 
public class SafariWorld {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		sc.close();
		
		System.out.println(n.subtract(m).abs());  	
		
	}

}
