public class Sport
{
    //1 Instance variables
    public String name;
    public int numOfPlayers;
    public String season;

    //2 Constructors
    public Sport (String name, int numOfPlayers, String season)
    {
        this.name = name;
        this.numOfPlayers = numOfPlayers;
        this.season = season;
    }

    //4 Getters
    public String getName()
    {
        return name;
    }
    public int getNumOfPlayers()
    {
        return numOfPlayers;
    }
    public String getSeason()
    {
        return season;
    }

    //5 Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNumOfPlayers(int numOfPlayers)
    {
        this.numOfPlayers = numOfPlayers;
    }
    public void setSeason(String season)
    {
        this.season = season;
    }

    //3 toString
    public String toString()
    {
        String output = "The name of the sport is " + name +
                        "\nThe number of players for this sport is " + numOfPlayers +
                        "\nThe season in which the sport is played is " + season;
        return output;
    }

}
