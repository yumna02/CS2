// Name: Yumna Ahmed Date: 11/24/20 Assignment: Program 19 SequentialSearchList q2

import java.util.ArrayList;
import java.util.List;

public class SequentialSearchList {
	
	 public static void main(String[] args) {
			
		    List<Integer> a = new ArrayList<Integer>();
		    
		    a.add(9);
		    a.add(5);
		    a.add(8);
		    a.add(4);
		    a.add(7);
		    
		    System.out.println(a.toString());
		    System.out.println(inList(a, 8));
		    System.out.println(inList(a, 6));
		    
	 }
	  
	 public static <T> boolean inList (List<Integer> anArray, int anEntry) {
			return search(anArray, 0, anArray.size()-1, anEntry);
		  }
		
	 public static boolean search (List<Integer> anArray, int first, int last, int desiredItem) {
			
		boolean find;
			
		if(first > last) {
			find = false;
	    }
	    else if(desiredItem == (anArray.get(first))) {
	    	find = true;
	    }
		else {
			find = search(anArray, first+1, last, desiredItem);
		}
		    return find;
		}
	  
}

