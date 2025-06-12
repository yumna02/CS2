// Name: Yumna Ahmed; Date: 11/17/20; Assignment: hw 15.1-3 ShowSortSteps

public class ShowSortSteps {
	
	public static void main( String[] args ) {
		System.out.println("#1.  Show the contents of the array of integers 5 7 4 9 8 5 6 3 each time a selection sort changes it while sorting the array into ascending order.");
		System.out.println("a[] = [ | 5 7 4 9 8 5 6 3 ]   | is the \"wall\";  \"select\" 3\n" + 
				"a[] = [ 3 | 7 4 9 8 5 6 5 ]   3 and 5 swap to sort 3 to the front;  the \"wall\";  \"select\" 4\n" + 
				"a[] = [ 3 4 | 7 9 8 5 6 5 ]   4 and 7 swap to sort 4 next;  the \"wall\";  \"select\" first 5\n" + 
				"a[] = [ 3 4 5 | 9 8 7 6 5 ]   5 and 7 swap to sort 5 next;  the \"wall\";  \"select\" first 5\n" + 
				"a[] = [ 3 4 5 5 | 8 7 6 9 ]   5 and 9 swap to sort 5 next;  the \"wall\";  \"select\" first 6\n" + 
				"a[] = [ 3 4 5 5 6 | 7 8 9 ]   8 and 6 swap to sort 6 next;  the \"wall\";  DONE\n" + 
				"a[] = [ 3 4 5 5 6 7 8 9]      Final result\n");
		System.out.println("#2.  Repeat Exercise 1, but use an insertion sort instead.");
		System.out.println("a[] = [ 5 7 4 9 8 5 6 3 ]     \"select\" first lowest number: 4;\n" + 
				"a[] = [ 4 5 7 9 8 5 6 3 ]     remove 4; add 4 to position/index: 0; \"select\" next lowest number: 8\n" + 
				"a[] = [ 4 5 7 8 9 5 6 3 ]     remove 8; add 8 to position/index: 3; \"select\" next lowest number: 5\n" + 
				"a[] = [ 4 5 5 7 8 9 6 3 ]     remove 5; add 5 to position/index: 1; \"select\" next lowest number: 6\n" + 
				"a[] = [ 4 5 5 6 7 8 9 3 ]     remove 6; add 6 to position/index: 3; \"select\" next lowest number: 3\n" + 
				"a[] = [ 3 4 5 5 6 7 8 9 ]     remove 3; add 3 to position/index: 0; DONE\n" + 
				"a[] = [ 3 4 5 5 6 7 8 9 ]     Final result\n");
		System.out.println("#3.  Repeat Exercise 1, but use a Shell sort instead.");
		System.out.println("a[] = [ 5 7 4 9 8 5 6 3 ]    n/2 → n=8 →  8/2 = 4 → indices of 4; “select” pair every 4 indices\n" + 
				"a[] = [ 5 7 4 9 8 5 6 3 ]    check to see if 5 < 8 → yes it is → no swap; select next pair: 7 and 5\n" + 
				"a[] = [ 5 5 4 9 8 7 6 3 ]    check to see if 7 < 5 → no it is not → swap; select next pair: 4 and 6\n" + 
				"a[] = [ 5 5 4 9 8 7 6 3 ]    check to see if 4 < 6 → yes it is → no swap; select next pair: 9 and 3\n" + 
				"a[] = [ 5 5 4 3 8 7 6 9 ]    check to see if 9 < 3 → no it is not → swap; n=4 →  4/2 = 2 → indices of 2;\n" + 
				"a[] = [ 5 5 4 3 8 7 6 9 ]    “select” pair every 2 indices: 5 and 4\n" + 
				"a[] = [ 4 5 5 3 8 7 6 9 ]    check to see if 5 < 4 → no it is not → swap; select next pair: 5 and 3\n" + 
				"a[] = [ 4 3 5 5 8 7 6 9 ]    check to see if 5 < 3 → no it is not → swap; select next pair: 5 and 8\n" + 
				"a[] = [ 4 3 5 5 8 7 6 9 ]    check to see if 5 < 8 → yes it is → no swap; select next pair: 5 and 7\n" + 
				"a[] = [ 4 3 5 5 8 7 6 9 ]    check to see if 5 < 7 → yes it is → no swap; select next pair: 8 and 6\n" + 
				"a[] = [ 4 3 5 5 6 7 8 9 ]    check to see if 8 < 6 → no it is not → swap; select next pair: 7 and 9\n" + 
				"a[] = [ 4 3 5 5 6 7 8 9 ]    check to see if 7 < 9 → yes it is → no swap; n=2 →  2/2 = 1 → indices of 1;\n" + 
				"a[] = [ 4 3 5 5 6 7 8 9 ]    “select” pair every 1 indices: 4 and 3\n" + 
				"a[] = [ 3 4 5 5 6 7 8 9 ]    check to see if 4 < 3 → no it is not → swap; DONE\n" + 
				"a[] = [ 3 4 5 5 6 7 8 9 ]    Final result");
	}

}
