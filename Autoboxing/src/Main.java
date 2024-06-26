import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt  = Integer.valueOf(12); //preferred but unnecessary
        Integer deprecatedBoxing = new Integer(12); //deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); //preferred but unnecessary

        //Automatic preferred
        Integer autodBoxing = 12;
        int autoBoxed = autodBoxing;
        System.out.println(autodBoxing.getClass().getName());

        Double resultBoxed = getDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[10];
        wrapperArray[0] = 1;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        var ourList = getList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList (int... varargs){
        ArrayList<Integer> list = new ArrayList<>();
        for (int var : varargs) {
            list.add(var);
        }
        return list;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getDoublePrimitive(){
        return 100.00;
    }
}