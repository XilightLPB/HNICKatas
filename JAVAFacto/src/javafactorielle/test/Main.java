package javafactorielle.test;

import javafactorielle.main.Operations;

public class Main {

	public static void main(String[] args) throws Exception {
		
		if (args.length != 1) {
			throw new Exception("Only one argument of an integer is expected");
		}
		else {
			int number = Integer.parseInt(args[0]);
			int result = Operations.FactoOf(number);
			System.out.print("Facto of " + String.valueOf(number) + " is: " + String.valueOf(result));
		}

	}

}
