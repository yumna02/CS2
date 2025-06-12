/**
 * 
 */

/**
 * @author yumna

 *
 */

// Name: Yumna Ahmed; Date: 8/28/20; Assignment: Program S1.3 FirstProgram

import java.util.Scanner;
public class FirstProgram{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Hello out there.");
    System.out.println("Want to talk some more?");
    System.out.println("Answer yes or no.");
    
    String answer = keyboard.next();
    if(answer.equals("yes")){
      System.out.println("Nice weather we're having.");
    }
    else{
      System.out.println("Good-bye.");
    }
  } // end main
} // end FirstProgram


//Name: Yumna Ahmed; Date: 8/28/20; Assignment: Program S1.3 FirstProgram
