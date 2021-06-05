import java.util.Scanner;

public class InningsMain {
    public static void main(String[] args) {
        Innings innings = new Innings();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name: ");
        innings.setTeamName(sc.next());
        System.out.println("Enter session: ");
        innings.setInningsName(sc.next());
        System.out.println("Enter runs: ");
        innings.setRuns(sc.nextInt());
        System.out.println(innings.displayInningsDetails());
    }
}
