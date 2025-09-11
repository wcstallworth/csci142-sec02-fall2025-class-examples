package shapes;

import java.awt.Color;
import java.awt.Point;

public class Square extends Shape implements Locatable {
	private double sideLength; 			// <-- "property"
	private Point location;
	
	public Square() {					// <-- "constructor"
		this(1.0, Color.WHITE, new Point(0, 0));
	}
	
	public Square(double sideLength, Color color, Point location) {
		super(color);
		if (!Double.isFinite(sideLength) || sideLength < 0.0) {
			throw new IllegalArgumentException("sideLength must not be null");
		}
		
		if (color == null) {
			throw new IllegalArgumentException("Color must not be null");
		}
		
		this.sideLength = sideLength;
		this.location = location;
		
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
		return "Square: sideLength = " + sideLength + " area = " + area() + " location = ("location.x +", " + location.y + super.toString();
	}

	@Override
	public Point locate() {
		return null;
	}
	
}
