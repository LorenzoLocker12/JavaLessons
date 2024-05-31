public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog husky = new Dog("Husky", 45, "pointy", "fluffy");
        doAnimalStuff(husky, "slow");

        Dog wolf = new Dog("wolf", 65);
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("GoldFish", 1, 2, 3);
        doAnimalStuff(goldie, "fast");


    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }

}