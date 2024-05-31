public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(String type, int weight){
        this(type, weight, "Perky", "Cloudy");
    }

    public Dog(String type, int weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makesNoise(){
        if(type.equals("wolf")){
            System.out.println("Ow Wooooo!");
        } else {
            bark();
        }
        System.out.println();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        if(speed.equals("slow")){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();

    }

    private void bark(){
        System.out.println("Woof!");
    }

    private void run(){
        System.out.println("Dog Running");
    }

    private void walk(){
        System.out.println("Dog Walking");
    }

    private void wagTail(){
        System.out.println("Dog waggingTail");
    }
}
