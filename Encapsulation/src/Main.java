public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Encapsulation!");
        Printer printer = new Printer(100, 0, true);
        System.out.println("Toner level : " + printer.getTonerLevel());
        printer.isDuplex();
        printer.printPages();
        printer.refill();
    }
}