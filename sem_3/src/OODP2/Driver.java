package OODP2;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

////        Question 2
//        System.out.println("Enter the breadth of rectangle: ");
//        int b = scan.nextInt();
//        System.out.println("Enter the length of rectangle: ");
//        int l = scan.nextInt();
//        System.out.println("\n\nThe perimeter of rectangle is " + new Rectangle(l, b).printPerimeter() + " units");

////        Question 3
//        System.out.println("Enter the Salesman Name: ");
//        String name = scan.nextLine();
//        System.out.println("Enter the Employee Number: ");
//        String number = scan.nextLine();
//        System.out.println("Enter the Quarter Q1: ");
//        int Q1 = scan.nextInt();
//        System.out.println("Enter the Quarter Q2: ");
//        int Q2 = scan.nextInt();
//        System.out.println("Enter the Quarter Q3: ");
//        int Q3 = scan.nextInt();
//        System.out.println("Enter the Quarter Q4: ");
//        int Q4 = scan.nextInt();
//        System.out.println("\n\n" + new Employee(name, number, Q1, Q2, Q3, Q4).printDetails());

//        Question 4

        int [] arr = {56,98,12,65,34,76,55,67,89,43,12,34,56,78,98,76,54,32,19,28,38,37,46,55};
        System.out.println(Arrays.toString(arr));
        System.out.println("\n\nThe Largest element in the above array is " + new LargestElementInArray(arr).findLargestNumber());
    }
}
