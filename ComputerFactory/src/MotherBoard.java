public class MotherBoard extends Product  {

    private int ramSlots;
    private int cardSlots;
    private String bios;
    private Dimensions dimensions;

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public MotherBoard(Dimensions dimensions,String model, String manufacturer,  int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
        this.dimensions = dimensions;
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.printf("Loading program %s...\n", programName);
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                ", dimensions=" + dimensions +
                "} " + super.toString();
    }
}
