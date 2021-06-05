import java.util.Scanner;

public class MatchMain {

    public static void main(String[] args) {
        int curr,score,ball;
        float over,rrr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the match format");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        int op=sc.nextInt();
        Match match;
        switch(op){
            case 1:
                ODIMatch o=new ODIMatch();
                match=o;
                System.out.println("Enter the Current Score");
                curr=sc.nextInt();
                System.out.println("Enter the Current Over");
                over=sc.nextFloat();
                System.out.println("Enter the Target Score");
                score=sc.nextInt();
                match.setValue(curr, over, score);
                rrr=match.calculateRunRate();
                ball=match.calculateBalls();
                match.display(rrr, ball);
                break;

            case 2:
                T20Match t=new T20Match();
                match=t;
                System.out.println("Enter the Current Score");
                curr=sc.nextInt();
                System.out.println("Enter the Current Over");
                over=sc.nextFloat();
                System.out.println("Enter the Target Score");
                score=sc.nextInt();
                match.setValue(curr, over, score);
                rrr=match.calculateRunRate();
                ball=match.calculateBalls();
                match.display(rrr, ball);

            case 3:
                TestMatch m=new TestMatch();
                match=m;
                System.out.println("Enter the Current Score");
                curr=sc.nextInt();
                System.out.println("Enter the Current Over");
                over=sc.nextFloat();
                System.out.println("Enter the Target Score");
                score=sc.nextInt();
                match.setValue(curr, over, score);
                rrr=match.calculateRunRate();
                ball=match.calculateBalls();
                match.display(rrr, ball);

        }

    }
}
