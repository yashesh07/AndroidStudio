package OODP1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room number : ");
        int roomNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the room type : ");
        String roomType = scan.nextLine();
        System.out.println("Enter the room area : ");
        int roomArea = scan.nextInt();
        Room room = new Room(roomNumber, roomType, roomArea);
        while(true){
            System.out.println("\n\n1. Enter 1 to edit data.\n2. Enter 2 to print details.\n3. Enter 3 to exit.\n\n");
            System.out.println("Enter your choice : ");
            int c = scan.nextInt();
            switch(c){
                case 1:{
                    System.out.println("Enter the room number : ");
                    roomNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the room type : ");
                    roomType = scan.nextLine();
                    System.out.println("Enter the room area : ");
                    roomArea = scan.nextInt();
                    room.setData(roomNumber, roomType, roomArea);
                    break;
                }
                case 2:
                    System.out.println(room.displayData());
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please enter correct number...");
            }
        }
    }
}

