//Name: Yumna Ahmed; Date: 9/29/20; Assignment: Program Java Interlude1 Generic Point

public class Point<T> implements Pairable<T>{

	private T x, y;
	
	public Point( T newX, T newY) {
		x = newX;
		y = newY;
	}
	
	public T getX() {
		return x;
	}
	
	public T getY() {
		return y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public void changeOrder(){
	    T temp = x;
	    x = y;
	    y = temp;
	 }
}
