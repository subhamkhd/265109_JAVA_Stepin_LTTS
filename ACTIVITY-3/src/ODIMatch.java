public class ODIMatch extends Match{

    public float calculateRunRate(){
        float rr=getTarget()-getScore();
        return (rr/calculateBalls())*6;


    }
    public int calculateBalls(){
        return 300-((int)getOver()*6);
    }
    public void display(double reqRunrate,int balls){
        System.out.println("Requirements:");

        System.out.println("Need "+(getTarget()-getScore())+" runs in "+balls+" balls");

        System.out.printf("Required Runrate: %.2f\n",reqRunrate);
    }
}
