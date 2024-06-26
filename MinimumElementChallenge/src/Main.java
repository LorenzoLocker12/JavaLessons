import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] userIntegers = readIntegers();
        System.out.println(Arrays.toString(userIntegers));
        System.out.println(findMin(userIntegers));
    }

    private static int[] readIntegers(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Write the numbers");
        String userInput = scan.nextLine();
        String[] inputNumbers = userInput.split(",");

        int[] numbers = new int[inputNumbers.length];


        for(int i = 0; i < inputNumbers.length; i++){
            numbers[i] = Integer.parseInt(inputNumbers[i].trim());
        }

        return numbers;
    }

    private static int findMin(int[] array){
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arrayCopy.length; i++){
            if(arrayCopy[i] < min){
                min = arrayCopy[i];
            }
        }
        return min;
    }
}