import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayReverse {

        public static int[] getIntegers(int size){
            int[] array = new int[size];
            Scanner scan = new Scanner(System.in);

            for(int i = 0; i < size; i++){

                System.out.println("Type a number: ");
                String userInput = scan.nextLine();
                int num = Integer.parseInt(userInput);

                array[i] = num;
            }
            return array;
        }


        public static void printArray(int[] array){
            int[] printArray = Arrays.copyOf(array, array.length);

            for(int i = 0; i < printArray.length; i++){
                System.out.println("Element " + i + " contents " + printArray[i]);
            }
        }


        public static int[] reversedSortIntegers(int[] array){

            int[] sortedArray = Arrays.copyOf(array, array.length);

            for (int i = 0; i < array.length; i++){
                for (int j = i + 1; j < array.length; j++){
                    if(array[i] < array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return array;
        }
}

