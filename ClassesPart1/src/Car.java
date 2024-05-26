import java.util.SortedMap;

public class Car {
    private String model;
    private String color;
    private String make;
    private int doors;
    public Car(){
        this("default make", "default color", "default model", 4);
        System.out.println("Empty constructor called");
    }

    public Car(String make, String color, String model, int doors){
        this.make = make;
        this.color = color;
        this.model = model;
        this.doors = doors;
        if(!make.equals("default make")){
            System.out.println("Constructor with prameters called!");
        }
    }

    public void carSpec(){
        System.out.println(model + " " + color + " " + make + " " + doors + " ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }



}
