public class Main
{
    public static void main (String[] args)
    {
        Sport testSport = new Sport("Test Sport", 10, "sport season");
        System.out.println(testSport.toString() + "\n");

        WaterPolo waterPolo = new WaterPolo(1, 30, "yellow", "Water Polo", 14, "Summer");
        System.out.println(waterPolo.toString() + "\n");

        Football football = new Football(100, 11, 11, 6, "Football", 22, "Winter");
        System.out.println(football.toString() + "\n");

        Baseball baseball = new Baseball(90, 34, "Baseball", 9, "Summer");
        System.out.println(baseball.toString());
    } // end main method
} // end class Main
