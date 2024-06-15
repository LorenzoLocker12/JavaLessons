package dev.lorenzo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog golden = new Dog("Golden", "Big", 75);

        Dog wolf = new Dog("Wolf", "Big", 100);

        Fish goldenfish = new Fish("Goldfish", "small", 20);

        Fish salmon = new Fish("Salmon", "medium", 40);

        Horse clydesale  = new Horse("Clydesale", "large", 1000);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(golden);
        animals.add(wolf);
        animals.add(goldenfish);
        animals.add(salmon);
        animals.add(clydesale);

        for (Animal animal: animals){
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
        if(animal instanceof Mamal currentMamal){
            currentMamal.shedHair();
        }
        System.out.println("-".repeat(20));

    }
}