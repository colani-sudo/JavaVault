public class Cooling {
    private int windows;
    private int doors;
    private Aircon aircon;

    public Cooling(int windows, int doors, Aircon aircon) {
        this.windows = windows;
        this.doors = doors;
        this.aircon = aircon;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public Aircon getAircon() {
        return aircon;
    }
}
