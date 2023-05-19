package OODP7;

public class Vehicle {
    private int no_of_seats;
    private int no_of_wheels;

    public Vehicle(int no_of_seats, int no_of_wheels){
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
    }

    public void showDescription(){
        System.out.println("\n\nNumber of seats: " + this.no_of_seats +
                "\nNumber of wheels: " + this.no_of_wheels);
    }
}

class Driver2 {
    public static void main(String[] args) {

//        Creating objects Motorcycle and Car
        Vehicle motorCycle = new Vehicle(2, 2);
        Vehicle car = new Vehicle(4, 4);

        System.out.println("output:");
        motorCycle.showDescription();
        car.showDescription();
    }
}
