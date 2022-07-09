public class Bathroom
{
    private boolean seats;
    private boolean basins;
    private boolean showers;

    public Bathroom(boolean seats, boolean basins, boolean showers) {
        this.seats = seats;
        this.basins = basins;
        this.showers = showers;
    }

    public void bathroomFeatures(){

        if(this.seats == true)
            System.out.println("\n| Seat |");
        if(this.basins == true)
            System.out.println("| Bath basin |");
        if(this.showers == true)
            System.out.print("| Shower |");
    }
}
