public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[5] = 50;

        double[] doubleArray = new double[10];
        doubleArray[5] = 50.5;
        System.out.println(doubleArray[5]);

        int[] firstFivePositives = {1,2,3,4,5};


        int[] newArray;
        newArray = new int[]{5, 4, 3, 2, 1};
//        newArray = new int[]{5};
        for (int i = 0; i < newArray.length; i++){
            System.out.printf(newArray[i] + " ");
        }

        for (int i : newArray){
            System.out.println(i);
        }
    }
}