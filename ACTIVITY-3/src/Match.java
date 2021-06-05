abstract class Match {

    private static int currentScore;
    private static float currentOver;
    private static int target;
    public void  setValue(int curr,float cur,int t){
        currentScore=curr;
        currentOver=cur;
        target=t;
    }
    public int getScore(){
        return currentScore;
    }
    public static float getOver(){
        return currentOver;
    }
    public static int getTarget(){
        return target;
    }

    abstract public float calculateRunRate();
    abstract public int calculateBalls();
    abstract public void display(double reqRunrate,int balls);
}
