public class Main {
    public static void main(String[] args) {

        Dimensions motherBoardDimensions = new Dimensions(20,30,40);

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");

        Monitor theMonitor = new Monitor("TH-3345", "ASUS", 24, "4k");

        MotherBoard theMotherBoard = new MotherBoard(motherBoardDimensions,"MB-22883", "Gigabyte", 2, 2,
                "v2.44");

        PersonalComputer myComputer = new PersonalComputer("Self Made", "Me", theMonitor, theCase
        , theMotherBoard);

        myComputer.powerUp();


//        myComputer.getMonitor().drawPixelAt(10, 10, "red");
//        myComputer.getMotherBoard().loadProgram("Discord");
//        myComputer.getComputerCase().pressPowerButton();

    }
}