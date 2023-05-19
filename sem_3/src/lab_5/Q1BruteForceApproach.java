package lab_5;

import java.util.Arrays;

public class Q1BruteForceApproach {

    public double minimumDistance(Point [] arr){
        double min = Double.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int d1 = (arr[j].x - arr[i].x)*(arr[j].x - arr[i].x);
                int d2 = (arr[j].y - arr[i].y)*(arr[j].y - arr[i].y);
                double distance = Math.sqrt((d1+d2));
                if(distance<min)    min = distance;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Point [] arr = {new Point(25, 3), new Point(34, 90), new Point(49, 45), new Point(69, 11), new Point(97, 18), new Point(88, 79), new Point(55, 42)};
        System.out.println("Input");
        for(int i = 0; i<arr.length; i++){
            System.out.print("{" + arr[i].x + "," + arr[i].y + "} ");
        }
        System.out.println("\n\nOutput");
        System.out.println(new Q1BruteForceApproach().minimumDistance(arr));
    }
}
