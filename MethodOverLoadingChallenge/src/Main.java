public class Main {
    public static void main(String[] args) {

    }
    public static double convertToCentimeters(int inches){
        double centimeters = (inches * 2.54);
        return centimeters;
    }

    public static double convertToCentimeters(int feet, int inches){
        int sum = ((feet * 12) + inches);
        return convertToCentimeters(sum);
    }

}