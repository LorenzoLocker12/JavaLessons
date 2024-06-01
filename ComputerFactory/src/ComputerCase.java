public class ComputerCase extends Product {

    private String powerSuply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);

    }

    public ComputerCase(String model, String manufacturer, String powerSuply) {
        super(model, manufacturer);
        this.powerSuply = powerSuply;
    }

    public void pressPowerButton(){
        System.out.println("Button pressed!");
    }
}
