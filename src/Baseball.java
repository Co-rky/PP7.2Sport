public class Baseball extends Sport
{
    //1 Instance Variables
    private int distBtwnPlates;
    private int batLength;

    //2 Constructors
    public Baseball (int distBtwnPlates, int batLength, String name, int numOfPlayers, String season)
    {
        super (name, numOfPlayers, season);
        this.distBtwnPlates = distBtwnPlates;
        this.batLength = batLength;
    }

    //4 Getters
    public int getDistBtwnPlates()
    {
        return distBtwnPlates;
    }
    public int getBatLength()
    {
        return batLength;
    }

    //5 Setters
    public void setDistBtwnPlates(int distBtwnPlates)
    {
        this.distBtwnPlates = distBtwnPlates;
    }
    public void setBatLength(int batLength)
    {
        this.batLength = batLength;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                        "\nDistance between the bases in ft: " + distBtwnPlates +
                        "\nLength of a the bat in in: " + batLength;
        return output;
    }
}
