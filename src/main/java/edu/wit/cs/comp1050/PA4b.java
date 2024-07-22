package edu.wit.cs.comp1050;

//TODO: document this class
public class PA4b {
	
	
	public static final String ERR_USAGE = "Please supply correct inputs: color x1 y1 x2 y2 x3 y3";
	
	public static final int NUM_ARGS = 7;
	
	/**
	 * Produces a string representing
	 * all vertex information in CSV
	 * format:
	 * "color",x,y
	 * 
	 * For all shape vertices,
	 * including axis-aligned bounding
	 * boxes for any included triangles
	 * 
	 * @param shapes array of shapes
	 * @return string of CSV information
	 */
	public static String shapeVertices(Shape2D[] shapes) {
		StringBuilder sb = new StringBuilder();

        for (Shape2D shape : shapes) {
            for (Point2D vertex : shape.getVertices()) {
                sb.append(String.format("\"%s\",%.3f,%.3f\n", shape.getColor(), vertex.getX(), vertex.getY()));
            }
            if (shape instanceof Triangle) {
                Rectangle aabb = ((Triangle) shape).getAxisAlignedBoundingBox();
                for (Point2D vertex : aabb.getVertices()) {
                    sb.append(String.format("\"%s\",%.3f,%.3f\n", shape.getColor(), vertex.getX(), vertex.getY()));
                }
            }
        }

        return sb.toString(); // replace with your code (use a StringBuilder for efficiency!)
	
	}
        
	/**
	 * Outputs vertex information in CSV
	 * format about the triangle supplied
	 * via command-line arguments, including
	 * its axis-aligned bounding box
	 * 
	 * @param args command-line arguments: color x1 y1 x2 y2 x3 y3
	 */
        
		public static void main(String[] args) {
			if (args.length != NUM_ARGS) {
				System.err.println(ERR_USAGE);
				return;
			}
			
			String color = args[0];
			try {
				double x1 = Double.parseDouble(args[1]);
				double y1 = Double.parseDouble(args[2]);
				double x2 = Double.parseDouble(args[3]);
				double y2 = Double.parseDouble(args[4]);
				double x3 = Double.parseDouble(args[5]);
				double y3 = Double.parseDouble(args[6]);
				
				Point2D p1 = new Point2D(x1, y1);
				Point2D p2 = new Point2D(x2, y2);
				Point2D p3 = new Point2D(x3, y3);
				
				Triangle triangle = new Triangle(color, p1, p2, p3);
				Shape2D[] shapes = { triangle };
				
				System.out.print(shapeVertices(shapes));
			} catch (NumberFormatException e) {
				System.err.println(ERR_USAGE);
			}
		}
	}


