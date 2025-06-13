// Name: Yumna Ahmed; Date: 11/17/20; Assignment: Program 15.4 SelectionSortDecending

import java.util.Arrays;

public class SortArray {
	
	public static void main( String[] args ) {
		String[] fruitBasket = {"Apple", "Banana", "Orange", "Pineapple", "Watermelon"};
		System.out.println(Arrays.toString(fruitBasket));
		//getIndexOfSmallest(fruitBasket, 0, 4);
		selectionSort(fruitBasket, fruitBasket.length);
		System.out.println(Arrays.toString(fruitBasket));
	}

	public static <T> void selectionSort(T[] x, int n) {
		
		for (int i = 0; i < n - 1; i++){
			int biggestIndex = getIndexOfBiggest(x, i, n-1);
			swap(x, i, biggestIndex);
		}
	}
	
	private static <T> int getIndexOfBiggest(T[] x, int first, int last) {
		
		T biggestIndex = x[first];
		int indexOfMax = first;
		for (int index = first + 1; index <= last; index++) {
			if (((String) x[index]).compareTo((String) biggestIndex) >0) { 
				biggestIndex = x[index]; 
				indexOfMax = index;
			}
		}
	return indexOfMax;
	}
	
	public static <T> void swap( T[] x, int z, int y ) {
		T temp = x[z];
		x[z] = x[y];
		x[y] = temp;
	}
	
}
