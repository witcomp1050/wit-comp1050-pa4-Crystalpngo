package edu.wit.cs.comp1050;

public class Triangle extends Shape2D {
	
	private Point2D p1;
	private Point2D p2;
	private Point2D p3;
	
	public Triangle(String color, Point2D p1, Point2D p2, Point2D p3) {
		super(color, "Triangle"); // replace with your code
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		
	}
	
	public Rectangle getAxisAlignedBoundingBox() {
		double minX = Math.min(p1.getX(), Math.min(p2.getX(), p3.getX()));
		double minY = Math.min(p1.getY(), Math.min(p2.getY(), p3.getY()));
		double maxX = Math.max(p1.getX(), Math.max(p2.getX(), p3.getX()));
		double maxY = Math.max(p1.getY(), Math.max(p2.getY(), p3.getY()));
		return new Rectangle(getColor(), new Point2D(minX, minY), new Point2D(maxX, maxY)); // replace with your code
	}

	@Override
	public double getArea() {
		return 0.5 * Math.abs(p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())); // replace with your code
	}

	@Override
	public double getPerimeter() {
		return Point2D.distance(p1, p2) + Point2D.distance(p2, p3) + Point2D.distance(p3, p1); // replace with your code
	}

	@Override
	public Point2D getCenter() {
		double centerX = (p1.getX() + p2.getX() + p3.getX()) / 3;
		double centerY = (p1.getY() + p2.getY() + p3.getY()) / 3;
		return new Point2D (centerX, centerY); // replace with your code
	}

	@Override
	public Point2D[] getVertices() {
		return new Point2D[] { p1, p2, p3 }; // replace with your code
	}

}
