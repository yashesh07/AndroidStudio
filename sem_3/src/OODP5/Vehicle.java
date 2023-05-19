package OODP5;

class Vehicle {
    private String vehicleType;
    private String fuelType;
    private String vehicleName;
    private String modelName;
    private String vehicleFeatures;
    private String mileage;
    private String vehicleCapacity;

    public Vehicle(String vehicleType, String fuelType, String vehicleName, String modelName, String vehicleFeatures, String mileage, String vehicleCapacity) {
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.vehicleName = vehicleName;
        this.modelName = modelName;
        this.vehicleFeatures = vehicleFeatures;
        this.mileage = mileage;
        this.vehicleCapacity = vehicleCapacity;
    }

    public String printDetails(){
        return "\nVehicle Type: " + this.vehicleType +
                "\nFuel Type: " + this.fuelType +
                "\nVehicle Name: " + this.vehicleName +
                "\nVehicle Model: " + this.modelName +
                "\nVehicle Features: " + this.vehicleFeatures +
                "\nMileage: " + this.mileage +
                "\nVehicle Capacity: " + this.vehicleCapacity;
    }
}

class Car extends Vehicle{
    public Car(String fuelType, String vehicleName, String modelName, String vehicleFeatures, String mileage, String vehicleCapacity) {
        super("Car", fuelType, vehicleName, modelName, vehicleFeatures, mileage, vehicleCapacity);
    }

    public String printDetails(){
        return super.printDetails();
    }

}

class Mercedes extends Car{
    public Mercedes(String fuelType, String vehicleName, String modelName, String vehicleFeatures, String mileage, String vehicleCapacity) {
        super(fuelType, vehicleName, modelName, vehicleFeatures, mileage, vehicleCapacity);
    }

    public String printDetails(){
        return super.printDetails();
    }
}

class Driver{
    public static void main(String[] args) {
        Mercedes maybach = new Mercedes("Diesel", "Mercedes", "Maybach", "[rear camera, 5000 cc engine, auto gear, sun roof, auto driving mode]", "4.7", "4 person");
        System.out.println(maybach.printDetails());
    }
}

