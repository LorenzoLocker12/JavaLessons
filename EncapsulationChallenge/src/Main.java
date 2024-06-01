public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.println(pagesPrinted + " " + printer.getPagesPrinted());
    }
}