public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> StartEngine");
    }

    protected void runEngine(){
        System.out.println("Car -> RunEngine");
    }

    public void drive() {
        System.out.println(description +" -> Driving, type is " + getClass().getSimpleName());
        runEngine();
    }

}

class GasPoweredCar extends Car{

    private double avgKilometerPerLitre;
    private int cylinders = 6;


    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKilometerPerLitre, int cylinders){
        super(description);
        this.avgKilometerPerLitre = avgKilometerPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d Cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas -> Gas running!");

    }





}

class ElectricCar extends Car{
    private double avgKilometerPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKilometerPerCharge, int batterySize) {
        super(description);
        this.avgKilometerPerCharge = avgKilometerPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("BEV -> Battery of size " + batterySize + "is on, Ready!");
    }

    @Override
    protected void runEngine() {
        System.out.println("BEV -> Battery running!");
    }
}

class HybridCar extends Car{
    private double avgKilometerPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKilometerPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKilometerPerLitre =  avgKilometerPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid -> Gas and Battery running!");
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> All %d Cylinders are fired, Ready!%n", cylinders);
        System.out.println("Hybrid -> Battery of size " + batterySize + "is on, Ready!");
    }

}
