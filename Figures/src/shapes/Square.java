package shapes;

public class Square {
	private float sideLength; 			// <-- "property"
	private float area;
	
	public Square() {					// <-- "constructor"
		sideLength = 1.0f;
		area = 1.0f;
	}
	
	public Square(float sideLength) {
		sideLength = sideLength;
		area = sideLength * sideLength;
	}
	
}
