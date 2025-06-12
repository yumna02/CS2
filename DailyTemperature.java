/**
 * 
 */

/**
 * @author yumna
 *
 */

//Name: Yumna Ahmed; Date: 8/31/20; Assignment: Program S1.86 Arrays

import java.util.Scanner; // 1.32 Keyboard Input Using the Class Scanner

public class DailyTemperature {
	
	public static void main(String[] args){
		
		int dayTemp;
		int[] temperature = new int[7]; // S1.86 Arrays (changed to int)
		
		for (int i = 0; i < 7; i++){
			temperature[i] += 4 ;
		} // S1.86 Arrays

		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter the respective number of which day's temperature you're trying to find out (the answer will be in Celsius): Monday = 0, Tuesday = 1, Wednesday = 2, Thursday = 3, Friday = 4, Saturday = 5, Sunday = 6");
		dayTemp = keyboard.nextInt(); 
		System.out.println("The weather on that day is: " + temperature[dayTemp] + " degrees Celsius.");
	}
}
