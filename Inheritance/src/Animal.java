public class Animal {
    private String type;
    private String size;
    private int weight;

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;

    }

    public Animal(){

    }

    @Override
    public String toString() {
        return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makesNoise(){
        System.out.println(type + " makesNoise");
    }

}
