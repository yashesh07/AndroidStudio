package OODP6;

class Car {

    Car(){
        this(4);
    }

    Car(int numberOfWheels){
        System.out.println("I am " + numberOfWheels + " wheel vehicle");
    }

}



class Driver {
    public static void main(String[] args) {
       new Car();
    }
}

