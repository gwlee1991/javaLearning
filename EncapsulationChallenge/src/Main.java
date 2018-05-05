public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Printed: " + pagesPrinted);
        pagesPrinted = printer.printPage(2);
        System.out.println("Printed: " + pagesPrinted);
        System.out.println("Total printed: " + printer.getPagesPrinted());
    }
}
