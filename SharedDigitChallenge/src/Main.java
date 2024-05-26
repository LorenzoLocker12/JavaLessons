public class Main {
    public static void main(String[] args) {
    }
    public static boolean hasSharedDigit(int param1, int param2){


        int highest, lowest, lowest2 = 0;



        if(param1 < 10 || param1 > 99 || param2 < 10 || param2 > 99 ) {
            return false;
        }


        if(param1 > param2){
            highest = param1;
            lowest = param2;
            lowest2 = param2;
        }
        else{
            highest = param2;
            lowest = param1;
            lowest2 = param1;
        }

        int temp1, temp2 = 0;

        while(highest > 0){
            temp1 = highest % 10;
            highest /= 10;
            while(lowest > 0){
                temp2 = lowest %10;
                lowest /= 10;
                if(temp2 == temp1){
                    return true;
                }
            }
            lowest = lowest2;

        }
        return false;
    }
}