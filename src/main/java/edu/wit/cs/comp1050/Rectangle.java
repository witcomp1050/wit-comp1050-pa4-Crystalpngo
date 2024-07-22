package edu.wit.cs.comp1050;

//TODO: document this class
public class Rectangle extends Shape2D {
	
	private Point2D lowerLeft;
	private Point2D upperRight;

	public Rectangle(String color, Point2D p1, Point2D p2) {
		super(color, "Rectangle"); // replace with your code
		this.lowerLeft = new Point2D(Math.min(p1.getX(), p2.getX()), Math.min(p1.getY(), p2.getY()));
		this.upperRight = new Point2D(Math.max(p1.getX(), p2.getX()), Math.max(p1.getY(), p2.getY()));
		
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Rectangle rectangle = (Rectangle) o;
		return lowerLeft.equals(rectangle.lowerLeft) && upperRight.equals(rectangle.upperRight); // replace with your code
	
	}

	public Point2D getLowerLeft() {
		return lowerLeft; // replace with your code
	}

	public Point2D getUpperRight() {
		return upperRight; // replace with your code
	}

	@Override
	public double getArea() {
		return (upperRight.getX() - lowerLeft.getX()) * (upperRight.getY() - lowerLeft.getY()); // replace with your code
	}

	@Override
	public double getPerimeter() {
		return 2 * ((upperRight.getX() - lowerLeft.getX()) + (upperRight.getY() - lowerLeft.getY())); // replace with your code
	}

	@Override
	public Point2D getCenter() {
		return new Point2D((lowerLeft.getX() + upperRight.getX()) / 2, (lowerLeft.getY() + upperRight.getY()) / 2); // replace with your code
	}

	@Override
	public Point2D[] getVertices() {
		Point2D upperLeft = new Point2D(lowerLeft.getX(), upperRight.getY());
		Point2D lowerRight = new Point2D(upperRight.getX(), lowerLeft.getY());
		return new Point2D[] { lowerLeft, lowerRight, upperRight, upperLeft }; // replace with your code
	}

}
