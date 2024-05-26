public class Main {
    public static void main(String[] args) {
    }
    public static int sumFirstAndLastDigit(int num){

        if(num < 0){
            return -1;
        }

        int last_number = num % 10;
        int first_number = num;

        while(first_number > 9){
            first_number /= 10;
        }

        return last_number + first_number;

    }
}