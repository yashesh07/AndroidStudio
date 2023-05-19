package lab_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1DivideAndConquerApproach {

    public double minimumDistance(Point [] arr){
        Point [] arrX = arr.clone();
        Point [] arrY = arr.clone();
        new SortXNY().sortingX(arrX, 0, arr.length);
        new SortXNY().sortingY(arrY, 0, arr.length);
        return closestRecursive(arrX, arrY, 0, arrX.length);
    }

    private double closestRecursive(Point [] arrX, Point [] arrY, int lowX, int highX){
        int midX = (lowX + highX)/2;
        int count = highX - lowX;
        Point midPoint = arrX[midX];
        if (count <= 3) {
            return bruteForce(arrX, lowX, highX);
        }
        double distanceLeft = closestRecursive(arrX, arrY, lowX, midX);
        double distanceRight = closestRecursive(arrX, arrY, midX, highX);
        double minDistance = Math.min(distanceLeft, distanceRight);
        ArrayList<Point> list = new ArrayList<>();
        for(int i = 0; i<count; i++){
            if(Math.abs(arrY[i].x-midPoint.x)<minDistance) list.add(arrY[i]);
        }
        minDistance = minDistanceOfElementsInStrip(list, minDistance);
        return minDistance;
    }

    private double minDistanceOfElementsInStrip(ArrayList<Point> arr, double minDistance){
        for(int i = 0; i<arr.size(); i++)
            for(int j = i+1; j<(Math.min(arr.size(), i+1+7)); j++)
                minDistance = Math.min(minDistance, distanceBetweenTwoPoints(arr.get(i), arr.get(j)));
        return minDistance;
    }

    private double bruteForce(Point [] arr, int low, int high){
        double min = Double.MAX_VALUE;
        for(int i = low; i<high; i++){
            for(int j = i+1; j<high; j++){
                double distance = distanceBetweenTwoPoints(arr[i], arr[j]);
                if(distance<min)    min = distance;
            }
        }
        return min;
    }

    private double distanceBetweenTwoPoints(Point p1, Point p2){
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
    }

    public static void main(String[] args) {
        Point [] arr = {new Point(25, 3), new Point(34, 90), new Point(49, 45), new Point(69, 11), new Point(97, 18), new Point(88, 79), new Point(55, 42)};
        System.out.println("Input");
        for(int i = 0; i<arr.length; i++){
            System.out.print("{" + arr[i].x + "," + arr[i].y + "} ");
        }
        System.out.println("\n\nOutput (divide and conquer approach)");
        System.out.println(new Q1DivideAndConquerApproach().minimumDistance(arr));
    }
}
