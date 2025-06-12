// Name: Yumna Ahmed Date: 10/23/20 Assignment: Program 9 Recursion

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		
		// #3 write a method that asks the user for integer input that is
		// b/w 1 and 10, inclusive. If the input is out of range, the
		// method should recursively ask the user to enter a new input value.
		
		int userInput = 0;
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter an integer:");
	    int userWord = input.nextInt();
	    
	    while(userInput > 10 || userInput < 1) {
	    	System.out.println("Please enter another integer:");
	    	userInput = input.nextInt();
	    }

	}
	
}
