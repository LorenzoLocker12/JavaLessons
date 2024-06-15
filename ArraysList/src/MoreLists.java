import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"Apples", "Bananas", "Milk", "Eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries= new ArrayList<>(list);
        groceries.add("Minions");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("Pickle", "idk"));
        nextList.add("YAY");
        System.out.println(nextList);

        groceries.addAll(nextList);

        System.out.println("Third item: " + groceries.get(2));

        if (groceries.contains("YAY")) {
            System.out.println("YAY is in the list");
        }
        

        groceries.add("Minions");
        groceries.add(5,"Minions");

        System.out.println(groceries);

        System.out.println(groceries.indexOf("Minions"));
        System.out.println(groceries.lastIndexOf("Minions"));

        groceries.remove("Minions");

        System.out.println(groceries);

        groceries.removeAll(List.of("Minions", "YAY"));

        System.out.println(groceries);

        groceries.clear();

        System.out.println(groceries);
        System.out.println(groceries.isEmpty());

        groceries.addAll(list);
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);


    }
}
