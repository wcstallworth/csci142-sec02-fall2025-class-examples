package shapes;

public class Square {
	private double sideLength; 			// <-- "property"
	
	public Square() {					// <-- "constructor"
		this.sideLength = 1.0f;
	}
	
	public Square(double sideLength) {
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

	public double getArea() {
		return this.sideLength * this.sideLength;
	}

}
