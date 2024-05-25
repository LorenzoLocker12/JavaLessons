public class Main {
    public static void main(String[] args) {


        for(int i = 0; i <= 1000; i++){
            if(i == 3) {
                break;
            }
            else if (isPrime(i)) {
                System.out.println(i + " is prime");
            }
            else{
                System.out.println(i + " is not prime");
            }

        }


    }

    public static boolean isPrime(int num){
        if(num <= 2){
            return (num == 2);
        }

        for (int divisor = 2; divisor < num; divisor++){
            if (num % divisor == 0){
                return false;
            }
        }

        return true;

    }
}