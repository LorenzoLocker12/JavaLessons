package lorenzo.dev;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) {
//        TODO: 1
//        Manage a list of products for slae including displaying the product details
//        TODO: 2
//        manage an order, which can just be a list of OrderItem objects
//        TODO: 3
//        have methods to add an item to the order, and print the ordered items, so it looks like a sale receipt
        products.add(new ArtObject("Oil Painting", 1350, "Impressionistic work 2010"));
        

    }
}
