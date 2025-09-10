package shapes;

import java.awt.Color;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square(15.0, Color.RED, new Point(4, 6));

		Square square3 = square2;
		
		square3.setSideLength(47.0);
		
		System.out.println(square1);
		System.out.println(square2);
		System.out.println(square3);
		
		/*
		 * Cannot instantiate an abstract class!
		 */
		//Shape shape = new Shape(Color.BLUE);
		
	}

}
