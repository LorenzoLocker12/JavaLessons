public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari");
        runRace(car);

        Car car2 = new GasPoweredCar("2024 Porsche", 7, 6);
        runRace(car2);

        Car car3 = new ElectricCar("2024 Tesla", 12, 27);
        runRace(car3);

        Car car4 = new HybridCar("2023 Volvo", 20, 6, 30);
        runRace(car4);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println("---------");
    }
}