package dev.lorenzo;

public class Dog extends Mamal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair(){
        System.out.println("Shed hair all the time");
    }

    @Override
    public void move(String speed){
        if(speed == "slow"){
            System.out.println(getExplicitType() + " walking");
        }
        else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public  void makeNoise(){

        if (type == "wolf"){
            System.out.println("Howling");
        }
        else {
            System.out.println("Woof");
        }
    }
}
