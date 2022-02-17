public class WaterPolo extends Sport
{
    //1 Instance Variables
    private int ptsPerGoal;
    private int lengthOfPool;
    private String colorOfBall;

    //2 Constructors
    public WaterPolo (int ptsPerGoal, int lengthOfPool, String colorOfBall, String name, int numOfPlayers, String season)
    {
        super (name, numOfPlayers, season);
        this.ptsPerGoal = ptsPerGoal;
        this.lengthOfPool = lengthOfPool;
        this.colorOfBall = colorOfBall;
    }

    //4 Getters
    public int getPtsPerGoal()
    {
        return ptsPerGoal;
    }
    public int getLengthOfPool()
    {
        return lengthOfPool;
    }
    public String getColorOfBall()
    {
        return colorOfBall;
    }

    //5 Setters
    public void setPtsPerGoal(int ptsPerGoal)
    {
        this.ptsPerGoal = ptsPerGoal;
    }
    public void setLengthOfPool(int lengthOfPool)
    {
        this.lengthOfPool = lengthOfPool;
    }
    public void setColorOfBall(String colorOfBall)
    {
        this.colorOfBall = colorOfBall;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                        "\nPoints per goal: " + ptsPerGoal +
                        "\nLength of pool in yd: " + lengthOfPool +
                        "\nColor of ball: " + colorOfBall;
        return output;
    }
}
