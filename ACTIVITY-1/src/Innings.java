public class Innings {
    private String teamName,inningsName;
    private int runs;
//getters
    public String getTeamName()
    {
        return teamName;
    }
    public String getInningsName()
    {
        return inningsName;
    }
    public int getRuns()
    {
        return runs;
    }
    //setters
    public void setTeamName(String n)
    {
        this.teamName=n;
    }
    public void setInningsName(String i)
    {
        this.inningsName=i;
    }
    public void setRuns(int r)
    {        if(r<0)
        System.out.println("Invalid input");
        else
            this.runs=r;
    }
    public String displayInningsDetails()
    {
        if(getInningsName().equalsIgnoreCase("first"))
      return "Team Name: " + getTeamName() +"\nInnings Name: "+getInningsName()  +"\nRuns: "+getRuns()+"\nNeed "+(getRuns()+1)+" to win";
        else
            return "Team Name: " + getTeamName() +"\nInnings Name: "+getInningsName()  +"\nRuns: "+getRuns()+"\nMatch Ended";


    }



}
