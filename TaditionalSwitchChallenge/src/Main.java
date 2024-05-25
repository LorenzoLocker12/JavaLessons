public class Main {
    public static void main(String[] args) {
        char letter = 'F';
        System.out.println(String.format("The letter %c in nato is equal to %s",letter, natoReplacerJdk8(letter)));
        System.out.println(String.format("The letter %c in nato is equal to %s",letter, natoReplacerJdk14(letter)));
    }

    public static String natoReplacerJdk8(char letter){
        switch (letter){
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charile";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Not Found";
        }
    }

    public static String natoReplacerJdk14(char letter){
        return switch (letter){
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Not Found";
        };
    }
}