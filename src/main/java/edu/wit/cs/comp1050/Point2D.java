package edu.wit.cs.comp1050;

//TODO: document this class
public class Point2D {
	
	private double x;
	private double y;
	
	public Point2D(double x, double y) {
		// replace with your code
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x; // replace with your code
	}
	
	public double getY() {
		return y; // replace with your code
	}
	
	@Override
	public String toString() {
		return String.format("(%.3f, %.3f", x, y); // replace with your code
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Point2D point2D = (Point2D) o;
		return Shape2D.closeEnough(x,  point2D.x) && Shape2D.closeEnough(y,  point2D.y); // replace with your code
		
	}
	
	public static double distance(Point2D p1, Point2D p2) {
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2)); // replace with your code
	}
	
	public double distanceTo(Point2D p) {
		return distance(this, p); // MUST call distance above with this point
	}

}
