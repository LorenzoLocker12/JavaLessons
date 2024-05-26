public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
           JavaStudent s = new JavaStudent("S" + i, switch (i){
               case 0 -> "Lorenzo";
               case 1 -> "Mary";
               case 2 -> "Jojo";
               case 3 -> "Bryan";
               case 4 -> "Jeff";
               default -> "Anonymous";
           },"12/02/2003","Java Class");
            System.out.println(s);
        }

    }
}