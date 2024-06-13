import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> groceries = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag) {
            System.out.println("Available actions: \n0 - to shudown" +
                    "\n1 - to add item(s) to list (comma delimited list)\n" +
                    "2- to remove any items (comma delimited list)\n" +
                    "Enter a number for wich action you want to do: ");

            String userInput = input.nextLine();
            int action = Integer.parseInt(userInput);

            switch (action) {
                case 0 -> flag = false;
                case 1 -> addItems();
                case 2 -> removeItems();
                default -> System.out.println("Invalid Value");
            }
        }

    }

    private static void addItems() {

        String[] arr = askUser().split(",");
        groceries.addAll(List.of(arr));
        printOrderedList();

    }

    private static void removeItems() {

        String[] arr = askUser().split(",");
        groceries.removeAll(List.of(arr));
        printOrderedList();

    }

    private static void printOrderedList(){

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

    }

    private static String askUser(){

        System.out.println("Write the elements you want to remove: ");
        return input.nextLine().trim();

    }
}