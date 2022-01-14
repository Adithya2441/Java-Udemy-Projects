package Challenge;

public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if((tonerLevel+tonerAmount)>100){
                return -1;
            }
            else{
                this.tonerLevel = this.tonerLevel + tonerAmount;
                return this.tonerLevel;
            }
        }
        else{
            return -1;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex == true){
            System.out.println("Printing in duplex format");
            pagesToPrint = ((pages/2)+(pages%2));
            this.pagesPrinted = this.pagesPrinted + pagesToPrint;
            return pagesToPrint;
        }
        else{
            pagesToPrint = pages;
            this.pagesPrinted = this.pagesPrinted + pagesToPrint;
            return pagesToPrint;
        }
    }
}
