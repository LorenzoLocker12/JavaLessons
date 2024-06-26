package lorenzo.dev;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(double quantity){
        return quantity * price;
    };

    public void printPricedLine(double quantity){
        System.out.printf("%2f qty at $%8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }

    public abstract void showDetails();


}
