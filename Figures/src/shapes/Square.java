package shapes;

public class Square {
	private double sideLength;
	
	public Square() {
		this.sideLength = 1.0f;
	}
	
	public Square(double sideLength) {
	    if (!Double.isFinite(sideLength) || sideLength < 0.0) {
	        throw new IllegalArgumentException("sideLength must be finite and >= 0");
	    }
	    this.sideLength = sideLength;
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
