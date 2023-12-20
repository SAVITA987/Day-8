package sample;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

	       
	        Point point1 = new Point(1, 2);
	        Point point2 = new Point(4, 6);

	        Line line1 = new Line(point1, point2);
	        Line line2 = new Line(new Point(3, 5), new Point(6, 9));

	        System.out.println("UC 1: Lines are equal: " + line1.equals(line2));

	        // UC 2: Comparing two lines
	        System.out.println("UC 2: Enter coordinates for Line 3 (x1, y1, x2, y2): ");
	        double x1 = scanner.nextDouble();
	        double y1 = scanner.nextDouble();
	        double x2 = scanner.nextDouble();
	        double y2 = scanner.nextDouble();

	        Point point3 = new Point(x1, y1);
	        Point point4 = new Point(x2, y2);

	        Line line3 = new Line(point3, point4);

	        int comparisonResult = line1.compareTo(line3);
	        if (comparisonResult < 0) {
	            System.out.println("UC 2: Line 1 is shorter than Line 3");
	        } else if (comparisonResult > 0) {
	            System.out.println("UC 2: Line 1 is longer than Line 3");
	        } else {
	            System.out.println("UC 2: Line 1 is equal to Line 3");
	        }

	      
	        System.out.println("UC 3: Length of Line 1 is: " + line1.calculateLength());

	      

	}

}
