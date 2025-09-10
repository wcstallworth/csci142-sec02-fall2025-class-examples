package shapes;

import java.awt.Color;
import java.awt.Point;

public class Square extends Shape implements Locatable {
	private double sideLength;
	private Point location;
	
	public Square() {
		this(1.0, Color.WHITE, new Point(0, 0));
	}
	
	public Square(double sideLength, Color color, Point location) {
		super(color);
	    if (!Double.isFinite(sideLength) || sideLength < 0.0) {
	        throw new IllegalArgumentException("sideLength must be finite and >= 0");
	    }
	    
	    if (location == null) {
	        throw new IllegalArgumentException("location cannot be null");
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
		return "Square: sideLength = " + sideLength 
				+ " area = " + area()
				+ " location = (" + location.x + ", " + location.y + ") "
				+ " " + super.toString();
	}

	@Override
	public Point locate() {
		return location;
	}

}
