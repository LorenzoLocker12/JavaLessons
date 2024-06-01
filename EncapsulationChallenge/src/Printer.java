public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel <= 100 && tonerLevel >= 0) ? tonerLevel : -1;;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int temp = tonerAmount + tonerLevel;
        if(temp > 100 || temp < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
        int tempPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += tempPages;
        return tempPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
