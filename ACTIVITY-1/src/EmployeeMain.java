import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        Employee employee =new Employee();
        System.out.println("Enter the name: ");
        employee.setName(sc.next());
        System.out.println("Enter the Adress: ");
        employee.setAddress(sc.next());
        System.out.println("Enter the Mobile: ");
        employee.setMobile(sc.next());


        System.out.println("Employee Details: ");
        System.out.println("Name: "+employee.getName());
        System.out.println("Adress: "+employee.getAdress());
        System.out.println("Mobile: "+employee.getMobile());

    }
}
