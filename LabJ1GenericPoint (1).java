//Name: Yumna Ahmed; Date: 9/29/20; Assignment: Program Java Interlude1 Generic Point

public class LabJ1GenericPoint{
  public static void main(String[] args){
	  
    Point<Integer> p0 = new Point<Integer>(1, 2);
    Point<Double> p1 = new Point<Double>(1.4, 2.5);
    
    System.out.println(p0);
    System.out.println(p1);
  }
}