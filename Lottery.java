/**
 * 
 */

/**
 * @author yumna
 *
 */

//Name: Yumna Ahmed; Date: 8/31/20; Assignment: Program S1.10 Elements of Java

import java.util.Scanner; // 1.32 Keyboard Input Using the Class Scanner

public class Lottery {
	public static void main(String[] args){
		
	int lotteryTicket;
	int winningTicket = (int) ((Math.random() * 100) + 1); // FIGURE S1-2 Some methods in the class Math
	
	Scanner keyboard = new Scanner(System.in); // 1.32 Keyboard Input Using the Class Scanner
	System.out.println("Please enter your ticket number (1-100).");
	lotteryTicket = keyboard.nextInt(); // 1.33 Keyboard Input Using the Class Scanner
	
	if(lotteryTicket == winningTicket) {
		System.out.println("Congratulations - you won!");
	}
	else {
		System.out.println("Sorry - but you didn't win :( ");
	}
	
	}
}
