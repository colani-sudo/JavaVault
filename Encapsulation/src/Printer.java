public class Printer {
    private static int tonerLevel = 0;
    private static int printedPages = 0;
    private boolean isDuplex = true;

    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        if(tonerLevel > 0 || tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.isDuplex = isDuplex;
    }

    public void refill(){
        if(this.tonerLevel < 5) {
            this.tonerLevel = 100;
            System.out.println("Refilling printer...");
        }
    }
    public void printPages(){
        this.tonerLevel -= 1;
        this.printedPages += 1;
        System.out.println("No. of printed pages : " + printedPages);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void isDuplex() {
        if(this.isDuplex == true)
            System.out.println("This is a Duplex printer");
        if(this.isDuplex == false)
            System.out.println("This printer is not Duplex");
    }
}
