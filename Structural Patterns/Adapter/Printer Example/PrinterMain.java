public class PrinterMain {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();

        Printer adapter = new PrinterAdapter(legacyPrinter);

        adapter.print();

    }
}
