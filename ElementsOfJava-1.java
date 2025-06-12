/**
 * 
 */

/**
 * @author yumna
 *
 */

//Name: Yumna Ahmed; Date: 8/28/20; Assignment: Program S1.10 Elements of Java

import java.util.Scanner;

public class ElementsOfJava {
	public static void main(String[] args){
		
		double taxOwed = 0;
		double yearlySalary;
		double taxRate = 0.075; // snippet from S1.19 under Elements of Java
		
		Scanner keyboard = new Scanner(System.in); // snippet from S1.5 under Elements of Java
		System.out.println("Please enter your yearly salary in order to find out how much tax you will pay this year.");
		yearlySalary = keyboard.nextInt(); 
		
		if(yearlySalary >= 60000.0) {
			taxRate += 0.005; // increment operator
			taxOwed = (double) yearlySalary * taxRate; // type casting
		}
		else {
			taxOwed = (double) yearlySalary * taxRate;
		}
		System.out.println("This is how much tax you have to pay this year: $" + taxOwed);
	}
}
