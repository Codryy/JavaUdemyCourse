// Tim's solution
public class Printer2 {

    private int tonerLever, pagesPrinted;
    private boolean duplex;

    public Printer2(int tonerLever, boolean duplex) {
        if( tonerLever > -1 && tonerLever <101) {
            this.tonerLever = tonerLever;
        } else {
            this.tonerLever = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if( (tonerAmount > 0) && (tonerAmount < 100) ) {
            if(this.tonerLever + tonerAmount > 100) {
                return -1;
            } else return (this.tonerLever + tonerAmount);
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(duplex) {
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
