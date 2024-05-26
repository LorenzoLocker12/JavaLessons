public class Main {
    public static void main(String[] args) {

    }
    public static void numberToWords(int num){

        int reversed, temp, first_digit_count= 0;



        if(num < 0){
            System.out.println("Invalid Value");
        }


        reversed = reverse(num);
        int count = 0;

        while(reversed > 0){
            temp = reversed % 10;
            reversed /= 10;

            switch (temp) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            count++;
        }

        first_digit_count = getDigitCount(num);

        if(first_digit_count > count){
            int sub = 0;

            sub = first_digit_count - count;

            for(int i = 0; i < sub; i++){
                System.out.println("Zero");
            }
        }



    }


    public static int reverse(int num){
        int temp, reversed = 0;

        if(num < 0) {
            num = Math.abs(num);
            while(num > 0){
                temp = num % 10;
                num /= 10;

                reversed = (reversed *10) + temp;
            }
            reversed = reversed * -1;
        }
        else{
            while(num > 0){
                temp = num % 10;
                num /= 10;

                reversed = (reversed *10) + temp;
            }
        }

        return reversed;
    }




    public static int getDigitCount(int num){

        int temp, count = 0;


        if(num < 0){
            return -1;
        }

        if(num == 0){
            return 1;
        }

        while(num > 0){
            num /= 10;
            count++;
        }

        return count;

    }

}