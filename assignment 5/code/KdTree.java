public class KdTree {
	int numPoints;
	
	// construct an empty set of points
	public KdTree() {}

	// is the set empty?
	public boolean isEmpty() {
		return numPoints == 0;
	}
	// number of points in the set
	public int size() {
		return numPoints;
	}

	// add the point p to the set (if it is not already in the set)
	public void insert(Point2D p) {
		
	}

	// does the set contain the point p?
	public boolean contains(Point2D p) {
		return true;
	}

	// draw all of the points to standard draw
	public void draw() {
		
	}

	// all points in the set that are inside the rectangle
	public Iterable<Point2D> range(RectHV rect) {
		
	}

	// a nearest neighbor in the set to p; null if set is empty
	public Point2D nearest(Point2D p) {
		
	}
}