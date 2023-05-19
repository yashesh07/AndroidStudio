package lab_2;

import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of candidates for the exam: ");
        int n = scan.nextInt();
        Examination exam = new Examination(n);
        while(true){
            System.out.println("\t1. Start registration.");
            System.out.println("\t2. Print candidates details.");
            System.out.println("\t3. Declare result.");
            System.out.println("\t4. Print candidates results.");
            System.out.println("\t5. Print rank list");
            System.out.println("\t6. Search result for individual candidate.");
            System.out.println("\t7. Exit.");
            System.out.println("\n\n\tEnter your choice: ");
            int c = scan.nextInt();
            switch (c) {
                case 1 -> exam.startRegistration();
                case 2 -> exam.printCandidateDetails();
                case 3 -> exam.declareResult();
                case 4 -> exam.printCandidatesResult();
                case 5 -> exam.printRankList();
                case 6 -> {
                    scan.nextLine();
                    System.out.println("Enter your application ID: ");
                    String str = scan.nextLine();
                    exam.printIndividualResult(str);
                }
                case 7 -> System.exit(1);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
