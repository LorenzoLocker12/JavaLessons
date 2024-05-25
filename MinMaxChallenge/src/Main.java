import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  num = 0;
        int loopCount = 0;
        int minValue = 0;
        int maxValue = 0;


        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Type any number, or a character to quit: ");
            String userInput = scanner.nextLine();
            try{
                num = Integer.parseInt(userInput);

                if(loopCount == 0 || num > maxValue){
                    maxValue = num;
                } else if(loopCount == 0 || num < minValue){
                    minValue = num;
                }
                loopCount++;

            } catch (NumberFormatException nfe) {
                break;
            }


        }

        System.out.println("Max Value is :" + maxValue + "\nMin Value is :" + minValue);
    }
}