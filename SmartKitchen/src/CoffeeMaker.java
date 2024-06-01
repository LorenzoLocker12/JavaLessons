public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {}

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.printf("Coffee beign made!\n");
            hasWorkToDo = false;
        }
    }
    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}
