package sample;

import java.util.Scanner;

	class Point {
	    private double x;
	    private double y;

	    // Constructor
	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    // Getters
	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }
	}

	class Line implements Comparable<Line> {
	    private Point startPoint;
	    private Point endPoint;

	    // Constructor
	    public Line(Point startPoint, Point endPoint) {
	        this.startPoint = startPoint;
	        this.endPoint = endPoint;
	    }

	    // Method to calculate the length of the line
	    public double calculateLength() {
	        double x1 = startPoint.getX();
	        double y1 = startPoint.getY();
	        double x2 = endPoint.getX();
	        double y2 = endPoint.getY();

	        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }

	    // Method to check equality of two lines
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Line otherLine = (Line) obj;
	        return startPoint.equals(otherLine.startPoint) && endPoint.equals(otherLine.endPoint);
	    }

	    // Method to compare two lines based on their lengths
	    @Override
	    public int compareTo(Line otherLine) {
	        double thisLength = this.calculateLength();
	        double otherLength = otherLine.calculateLength();

	        return Double.compare(thisLength, otherLength);
	    }
	}


