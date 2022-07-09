public class Furniture
{
    private int bed;
    private int stove;
    private int table;
    private Lighting lighting;

    public Furniture(int bed, int stove, int table, Lighting lighting) {
        this.bed = bed;
        this.stove = stove;
        this.table = table;
        this.lighting = lighting;
    }

    public int getBed() {
        return bed;
    }

    public int getStove() {
        return stove;
    }

    public int getTable() {
        return table;
    }

    public Lighting getLighting() {
        return lighting;
    }
}
