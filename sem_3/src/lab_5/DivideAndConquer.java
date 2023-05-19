package lab_5;

import java.lang.Math;
import java.util.Arrays;

public class DivideAndConquer 
{
	static int compareX(Point a, Point b)
        {
	    return (a.x - b.x);
	}

	static int compareY(Point a, Point b){
	    return (a.y - b.y);
	}
	
	static double dist(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}

	static double bruteForce(Point P[], int n) {
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i)
			for (int j = i + 1; j < n; ++j)
				if (dist(P[i], P[j]) < min)
					min = dist(P[i], P[j]);
		return min;
	}
    
	static double min(double x, double y) {
		return (x < y) ? x : y;
	}

	static double stripClosest(Point strip[], int size, double d)
	{
		double min = d;
		for (int i = 0; i < size; ++i)
			for (int j = i+1; j < size && (strip[j].y - strip[i].y) < min; ++j)
				if (dist(strip[i],strip[j]) < min)
					min = dist(strip[i], strip[j]);

    	return min;
	}

	static double closestUtil(Point P[], int n) {
		if (n <= 3)
			return bruteForce(P, n);
		int mid = n/2;
		Point midPoint = P[mid];
		Point[] DL= Arrays.copyOfRange(P, 0, mid);
		double dl = closestUtil(DL, mid);
		Point[] DR= Arrays.copyOfRange(P, mid, n);
		double dr = closestUtil(DR, n - mid);
		double d = min(dl, dr);
		Point[] strip= new Point[n];
		int j = 0;
		for (int i = 0; i < n; i++)
			if (Math.abs(P[i].x - midPoint.x) < d) {
				strip[j] = P[i];
				j++;
			}
		return min(d, stripClosest(strip, j, d) );
	}

	static double closest(Point P[], int n) {
		return closestUtil(P, n);
	}

	public static void main(String[] args) {
		Point P4=new Point(2, 3);
		Point P1=new Point(12, 30);
		Point P2=new Point(40, 50);
		Point P3=new Point(5, 1);
		Point P5=new Point(12, 10);
		Point P6=new Point(3, 4);
		Point P[] = {P4,P1,P2,P3,P5,P6};
    	int n = P.length;
		System.out.println("The smallest distance is " + closest(P, n));
	}
}

