public class PrinterAdapter implements Printer{
    LegacyPrinter lp;

    public PrinterAdapter(LegacyPrinter lp){
        this.lp = lp;
    }

    @Override
    public void print() {
        lp.printDocument();
    }

}
