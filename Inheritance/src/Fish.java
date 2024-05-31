public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, int weight, int fins, int gills){
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.println("Muscles moving");
    }

    private void moveBackFin(){
        System.out.println("BackFin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed.equals("fast")){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
