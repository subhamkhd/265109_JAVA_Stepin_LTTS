import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        String input=sc.next();
        String arr[]=input.split(",");

        Customer customer=new Customer();
        customer.setName(arr[0]);
        customer.setAddress(arr[1]);
        customer.setMobile(arr[2]);
        System.out.println("Name: "+ customer.getName()+"\nAdress: "+customer.getAddress()+"\nMobile: "+customer.getMobile());



    }
}
