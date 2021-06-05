public class TwoWheeler extends Vehicle {
    private boolean kickStartAvailable;

    public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
                      boolean kickStartAvailable) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);

        this.kickStartAvailable = kickStartAvailable;
    }

    public void displayDetailInfo() {
        System.out.println("---Detail Information---");
        if (kickStartAvailable) {
            System.out.println("kickStartAvailable: Yes");
        } else {
            System.out.println("kickStartAvailable: No");
        }
    }
}