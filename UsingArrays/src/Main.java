import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arrayList = getRandomArray(10);
        System.out.println(Arrays.toString(arrayList));
        Arrays.sort(arrayList);
        System.out.println(Arrays.toString(arrayList));
    }

    private static int[] getRandomArray(int len){
        Random rand = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = rand.nextInt(101);
        }

        return newInt;
    }
}