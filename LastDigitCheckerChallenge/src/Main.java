public class Main {
    public static void main(String[] args) {

    }
    public static boolean hasSameLastDigit(int param1, int param2, int param3){

        int temp1, temp2, temp3 = 0;

        if(!isValid(param1) || !isValid(param2) || !isValid(param3)){
            return false;
        }

        temp1 = param1 %10;
        temp2 = param2 %10;
        temp3 = param3 %10;

        return (temp1 == temp2) || (temp2 == temp3) || (temp3 == temp1);
    }

    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
}