import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = generateRandomArray(100, 100);

        System.out.println("Unsorted Array: " + Arrays.toString(array));

        sortArray(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));

        int[] newArray = SortedArrayReverse.getIntegers(10);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(SortedArrayReverse.reversedSortIntegers(newArray)));


    }

    private static int[] generateRandomArray(int arraySize, int randomBound){
         int[] array = new int[arraySize];
         for(int i =0 ; i < arraySize; i++){
             Random rand = new Random();
             array[i] = rand.nextInt(randomBound +1);
         }
         return array;
    }

    private static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array.length; j++){
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