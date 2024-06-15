package dev.lorenzo;

abstract class Mamal extends Animal {

    public Mamal(String type, String sizer, double weight) {
        super(type, sizer, weight);
    }

    @Override
    public void move(String speed){
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow")? "walks" : "runs");
    }

    public abstract void shedHair();

}


public abstract class Animal {
    protected String type;
    private String sizer;
    private double weight;

    public Animal(String type, String sizer, double weight) {
        this.type = type;
        this.sizer = sizer;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    public String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
