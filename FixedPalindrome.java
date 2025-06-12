// Name: Yumna Ahmed Date: 10/21/20 Assignment: Program 7.11 Palindrome (redo_

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;
  
public class FixedPalindrome{
	
  public static void main(String[] args) {
    
	// The ADT that I am using is a deque:
	Deque<String> backwardsWord = new LinkedList<String>();
	Deque<String> theUsersWord = new LinkedList<String>();
	    
    Scanner enteredWord = new Scanner(System.in);
    System.out.println("Please enter a word/string (make sure it is all in lowercase) to see whether or not it is a palindrome (note: a palindrome is any word that can make the same word even when it is flipped ex - civic).");
    String userWord = enteredWord.nextLine();
    
    // This adds the letter from the end to the front of the user's entered word
    for (int i = 0; i <= userWord.length() - 1; i++) {
      String letter = userWord.substring(i,i+1);
      backwardsWord.addLast(letter);
    }
    
    for (int i = 0; i <= userWord.length() - 1; i++) {
        String letter = userWord.substring(i,i+1);
        theUsersWord.addFirst(letter);
      }
    
    //System.out.println(backwardsWord);
    //System.out.println(theUsersWord);
    
    if (backwardsWord.equals(theUsersWord)){
    	System.out.println("Yay! The word/string you have entered is a palindrome!");
    }
    else{
    	 System.out.println("I'm sorry, the word/string you have entered is not a palindrome.");
    }
    
  }
}
