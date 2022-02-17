public class Football extends Sport
{
    //1 Instance Variables
    private int lengthOfField;
    private int defensivePlayers;
    private int offensivePlayers;
    private int ptsPerTouchdown;

    //2 Constructors
    public Football (int lengthOfField, int defensivePlayers, int offensivePlayers, int ptsPerTouchdown, String name, int numOfPlayers, String season)
    {
        super(name, numOfPlayers, season);
        this.lengthOfField = lengthOfField;
        this.defensivePlayers = defensivePlayers;
        this.offensivePlayers = offensivePlayers;
        this.ptsPerTouchdown = ptsPerTouchdown;
    }

    //4 Getters
    public int getLengthOfField()
    {
        return lengthOfField;
    }
    public int getDefensivePlayers()
    {
        return defensivePlayers;
    }
    public int getOffensivePlayers()
    {
        return offensivePlayers;
    }
    public int getPtsPerTouchdown()
    {
        return ptsPerTouchdown;
    }

    //5 Setters
    public void setLengthOfField(int lengthOfField)
    {
        this.lengthOfField = lengthOfField;
    }
    public void setDefensivePlayers(int defensivePlayers)
    {
        this.defensivePlayers = defensivePlayers;
    }
    public void setOffensivePlayers(int offensivePlayers)
    {
        this.offensivePlayers = offensivePlayers;
    }
    public void setPtsPerTouchdown(int ptsPerTouchdown)
    {
        this.ptsPerTouchdown = ptsPerTouchdown;
    }

    //3 toString
    public String toString()
    {
        String output = super.toString() +
                        "\nLength of field in yd: " + lengthOfField +
                        "\nNum of defensive players: " + defensivePlayers +
                        "\nNum of offensive players: " + offensivePlayers +
                        "\nPoints per touchdown: " + ptsPerTouchdown;
        return output;
    }
}
