package shapes;

import java.awt.Color;

public class Square extends Shape {
	private double sideLength; 			// <-- "property"
	
	public Square() {					// <-- "constructor"
		this(1.0, Color.WHITE);
	}
	
	public Square(double sideLength, Color color) {
		super(color);
		if (sideLength <= 0.0) {
			this.sideLength = 1.0;
		} else {
			this.sideLength = sideLength;
		}
		
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double area() {
		return this.sideLength * this.sideLength;
	}

	@Override
	public String toString() {
		return "Square: sideLength = " + sideLength + " area = " + area() + super.toString();
	}
	
}
