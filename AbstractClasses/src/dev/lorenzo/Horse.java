package dev.lorenzo;

public class Horse extends Mamal{


    public Horse(String type, String sizer, double weight) {
        super(type, sizer, weight);
    }

    @Override
    public void shedHair(){
        System.out.println("Sheds in the spring");
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " running");
    }

    @Override
    public void makeNoise() {

        System.out.println("IHIHIHIHIIH");

    }
}
