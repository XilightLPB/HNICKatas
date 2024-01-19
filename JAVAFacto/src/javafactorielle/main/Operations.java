package javafactorielle.main;

public class Operations {

	
	//Factorial is a mathematical function that multiplies all positive integers less than or equal to a given positive integer
	public static int FactoOf(int n) {
		int res = 1;
		
		for (int i = 1; i<= n; i++) {
			System.out.println("incrementing i, i is now: " + String.valueOf(i));
			res = res * i;
		}
		return res;
	}
}


