// Name: Yumna Ahmed; Date: 11/17/20; Assignment: Program 16 Sorting (#17 pg.457)

//import java.util.Arrays;

public class Person {
	
	public static void main( String[] args ) {
		
		Person[] array;
		//{"443-555-1232", "555-0009", "789-1022"};
		array = new Person[3];
		
		array[0] = new Person(phoneNumber); 
		array[1] = new Person(phoneNumber); 
		array[2] = new Person(phoneNumber); 
		
		array[0].setPhoneNumber("443-555-1232"); 
		array[1].setPhoneNumber("555-0009"); 
		array[2].setPhoneNumber("789-1022"); 
		
		//System.out.println(Arrays.toString(array));
		System.out.println(array[0].getPhoneNumber());
		System.out.println(array[1].getPhoneNumber());
		System.out.println(array[2].getPhoneNumber());
		
		System.out.println("I have no idea what is wrong with my code, whenever I even try to get it to print out the array it keeps printing the same phone number in position two -- let alone getting my methods to work.");

	}
	
	private static String phoneNumber;
	
	public Person (String phoneNumber) {
		this.setPhoneNumber(phoneNumber);
	}
	
	private int compareTo(Person[] array) {
		
		Person firstPerson = array[0];
		int indexOfMin = 0;
		for (int index = 0 + 1; index <= 3; index++) {
			if ((((Person) array[index]) < ((Person) array[index+1]))) { 
				firstPerson = array[index]; 
				indexOfMin = index;
			}
		}
	return indexOfMin;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		Person.phoneNumber = phoneNumber;
	}
}
