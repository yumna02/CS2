// Name: Yumna Ahmed Date: 10/23/20 Assignment: Program 10.8 SantaList

import java.util.List;
import java.util.ArrayList;

public class SantaList {
	public static void main(String[] args) {
		
		//naughty list
		
		Name naughtyC0 = new Name("Mr.", "Grinch");
		Name naughtyC1 = new Name("Mr.", "Bad");
		
		List<String> naughtyList = new ArrayList<String>();

		NaughtyChild naughtyChild0 = new NaughtyChild(naughtyC0);
		NaughtyChild naughtyChild1 = new NaughtyChild(naughtyC1);
  
		naughtyList.add(naughtyChild0.toString());
		naughtyList.add(naughtyChild1.toString());
		
		System.out.println("Naughty List: ");
		System.out.println(naughtyList);
		
		//nice list
		
		Name niceC1 = new Name("Mr.", "Reed");
		Name niceC2 = new Name("Mother", "Dear");
		Name niceC0 = new Name("Yumna", "Ahmed");
		
		List<String> niceList = new ArrayList<String>();

		List<String> gifts = new ArrayList<String>();
		
		gifts.add("iPhone 12, ");
		gifts.add("New Car, ");
		gifts.add("New Clothes");
		
		NiceChild niceChild0 = new NiceChild(niceC0, gifts);
		niceList.add(niceChild0.toString());
		
		gifts.add("Money, ");
		gifts.add("Candy, ");
		gifts.add("New Computer");
		
		NiceChild niceChild1 = new NiceChild(niceC1, gifts);
		niceList.add(niceChild1.toString());
		gifts.clear();
		
		gifts.add("Flowers, ");
		gifts.add("Candles, ");
		gifts.add("Healthy Food, ");
		gifts.add("Chocolate Treats ");
		
		NiceChild niceChild2 = new NiceChild(niceC2, gifts);
		niceList.add(niceChild2.toString());
  
		System.out.println("Nice List: ");
		System.out.println(niceList);

	}
}
