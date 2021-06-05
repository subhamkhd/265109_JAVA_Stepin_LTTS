public class Vehicle {

    private String make;
    private String vehicleNumber;
    private String fuelType;
    private int fuelCapacity;
    private int cc;

    public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public String getMake() {
        return make;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCc() {
        return cc;
    }

    public void displayMake() {
        System.out.println("***" + make + "***");
    }

    public void displayBasicInfo() {
        System.out.println("---Basic Information---");
        System.out.println("Basic Info\nVehicle Number: " + vehicleNumber + "\nFuel Type: " + fuelType
                + "\nFuel Capacity: " + fuelCapacity + "\nCC: " + cc);
    }

    public void displayDetailInfo() {
    }
}
