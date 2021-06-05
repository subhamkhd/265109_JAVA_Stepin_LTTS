import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        Company company=new Company();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the company name: ");
        company.setName(scanner.next());
        System.out.println("Enter the employees: ");
        String input= scanner.next();
        company.setEmployees(input);
        String arr[]=input.split(",");
        System.out.println("Enter the Team Lead: ");
        //String a= scanner.next();
        company.setTeamLead(scanner.next());
        boolean found=false;
        for(String lead:arr)
        {
            if(company.getTeamLead().equals(lead) )
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Name: "+company.getName()+"\nEmployees: "+company.getEmployees()+"\nLead: "+company.getTeamLead());

        }
        else {
            System.out.println("Invalid input");
        }





    }
}
