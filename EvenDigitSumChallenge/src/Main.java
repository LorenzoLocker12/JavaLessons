public class Main {
    public static void main(String[] args) {

    }
    public static int getEvenDigitSum(int num){

        if (num < 0){
            return -1;
        }

        int temp = 0;
        int sum = 0;
        int pop = 0;

        while(num > 0){

            temp = num % 10;

            if(temp % 2 == 0){
                sum += temp;
            }

            num /= 10;
        }
        return sum;
    }
}