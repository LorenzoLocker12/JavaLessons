import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    private static int[] reverseArray(int[] arr) {
        int[] newArr = Arrays.copyOf(arr,arr.length);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = newArr[i];
            newArr[i] = newArr[arr.length - i - 1];
            newArr[arr.length - i - 1] = temp;

        }

        return newArr;
    }

}