import java.util.Scanner;
public class VehicleMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter make: ");
            String make = sc.next();
            System.out.print("\nEnter Vehicle Number: ");
            String vehicleNumber = sc.next();
            System.out.print("\nEnter Fuel Type: 1.Diesel\n2.Petrol");
            int ch = sc.nextInt();
            String fuelType;
            if (ch == 1)
                fuelType = "Diesel";
            else
                fuelType = "Petrol";
            System.out.print("\nEnter Fuel Capacity: ");
            int fuelCapacity = sc.nextInt();
            System.out.print("\nEnter CC: ");
            int cc = sc.nextInt();
            System.out.print("\nEnter Audio System: ");
            String audioSystem = sc.next();
            System.out.print("\nEnter Number of Doors: ");
            int numberOfDoors = sc.nextInt();
            FourWheeler fw = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem,
                    numberOfDoors);
            fw.displayMake();
            fw.displayBasicInfo();
            fw.displayDetailInfo();
        } else {
            System.out.print("\nEnter Make: ");
            String make = sc.next();
            System.out.print("\nEnter Vehicle Number: ");
            String vehicleNumber = sc.next();
            System.out.print("\nEnter Fuel Type: 1.Diesel\n2.Petrol");
            int ch = sc.nextInt();
            String fuelType;
            if (ch == 1)
                fuelType = "Diesel";
            else
                fuelType = "Petrol";
            System.out.print("\nEnter Fuel Capacity: ");
            int fuelCapacity = sc.nextInt();
            System.out.print("\nEnter CC: ");
            int cc = sc.nextInt();
            System.out.print("\nKickStart");
            boolean kickStartAvailable = sc.nextBoolean();
            TwoWheeler tw = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
            tw.displayMake();
            tw.displayBasicInfo();
            tw.displayDetailInfo();
        }
    }
}
