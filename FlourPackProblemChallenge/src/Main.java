public class Main {
    public static void main(String[] args) {

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int flourFromBigBags = bigCount * 5;

        if (flourFromBigBags + smallCount < goal) {
            return false;
        }

        return goal % 5 <= smallCount;
    }
}