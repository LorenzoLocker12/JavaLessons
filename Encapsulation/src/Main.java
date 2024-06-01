public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Lorenzo";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.printf("Remaining health: %d\n", player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.printf("Remaining health: %d\n", player.healthRemaining());

        EnhancedPlayer lorenzo = new EnhancedPlayer("Lorenzo", 200, "Sword");
        System.out.println("Initial health is " + lorenzo.healthRemaining());


    }
}