import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    record GroceryItem(String name, String type, int count) {
        public GroceryItem(String name){
            this(name, "DAIRY", 1);
        }

        @Override
        public String toString() {
            return String.format("%d %s in %s", count, type, name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("butter"));
        groceryList.add(new GroceryItem("Oranges", "PRODUCE", 6));
        groceryList.set(0, new GroceryItem("Apple", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);


    }
}