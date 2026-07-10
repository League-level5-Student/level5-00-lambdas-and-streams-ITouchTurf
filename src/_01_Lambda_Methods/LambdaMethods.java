package _01_Lambda_Methods;

import java.util.ArrayList;
import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		//		printCustomMessage((s)->{
		//			for(int i = 0; i < 10; i++) {
		//				System.out.println(s);
		//			}
		//		}, "repeat");
		//		
		//		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		//		printCustomMessage((s)-> {
		//			for(int i = 0; i>10; i--) {
		//				for(int j = s.length(); j>0; j--) {
		//				char[] grades = null;
		//				grades[j]= s.charAt(j);
		//				System.out.print(grades[j]);
		//				}
		//			}
		//		}, "abcd");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
	

		printCustomMessage((s)-> {
	
			String printed = s;
			char[] random = new char[printed.length()];
			String result = "";
			for(int i = 0; i<5; i++) {
				 
				for(int j = 0; j<printed.length(); j++) {

					Random r = new Random();
					if(r.nextBoolean()) {
						random[j] = printed.toUpperCase().charAt(j);
					} else {
						random[j] = printed.charAt(j);
					}

				}
				result = new String(random);
				System.out.println(result);
			}
		}, "random uppercase");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)-> {
			
			String printed = s;
			char[] random = new char[printed.length()*2];
			String result = "";
			for(int i = 0; i<5; i++) {
				 
				for(int j = 0; j<printed.length()*2; j++) {
					if(j%2==0) {
						random[j] = printed.charAt(j/2);
					} else {
						random[j] = '.';
					}
					
				}
				result = new String(random);
				System.out.println(result);
				}
		}, "theres a period in between each character");

		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
printCustomMessage((s) -> {
	String printed = s;
	ArrayList<Character>without = new ArrayList<Character>();
	String result = "";
	for(int i = 0; i<5; i++) {
		without = new ArrayList<Character>();
		for(int j = 0; j<printed.length(); j++) {
			if(printed.charAt(j) != 'e' && printed.charAt(j) != 'a' && printed.charAt(j) != 'i' && printed.charAt(j) != 'o' && printed.charAt(j) != 'u') {
				without.add(printed.charAt(j));
			}
		}
		result = without.toString();
		System.out.println(result);
	}
	
}, "no vowels allowed");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}

