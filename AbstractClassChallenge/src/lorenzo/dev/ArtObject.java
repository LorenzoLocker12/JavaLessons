 package lorenzo.dev;

public class ArtObject extends ProductForSale{

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beatiful reproduction");
        System.out.printf("The price of the piece is %n", price);
        System.out.println(description);
    }
}
