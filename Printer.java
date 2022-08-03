// My solution
public class Printer {

    private int tonerLevel, numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplex = duplex;
    }

    public void fillToner(int toner){
        if ( (this.tonerLevel += toner) > 100 ) {
            this.tonerLevel = 100;
        } else if( (this.tonerLevel += toner) < 0) {
            this.tonerLevel = 0;
        } else this.tonerLevel += toner;
    }

    public void printPages(boolean duplex, int pages){
        if(duplex) {
            this.numberOfPagesPrinted += ( pages / 2);
            System.out.println("Printer is a douplex");
        } else {
            this.numberOfPagesPrinted += pages;
            System.out.println("Printer on a single face of the page");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
