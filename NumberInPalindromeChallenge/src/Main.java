public class Main {
    public static void main(String[] args) {
    }

    public static boolean isPalindrome(int num){
        num = Math.abs(num);
        int temp = 0;
        int reversed = 0;

        if(num % 10 == 0){
            return false;
        }


        while(reversed < num){
            temp = num % 10;
            num /= 10;
            reversed = (reversed * 10) + temp;
        }

        if(num == reversed || num == reversed / 10){
            return true;
        }

        return false;
    }

}