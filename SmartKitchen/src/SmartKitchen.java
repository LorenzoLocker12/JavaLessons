public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean dishWasherState, boolean iceBoxState, boolean brewMasterState){
        dishWasher.setHasWorkToDo(dishWasherState);
        iceBox.setHasWorkToDo(iceBoxState);
        brewMaster.setHasWorkToDo(brewMasterState);
    }

    public void doKitchenWork(){

    }

}
