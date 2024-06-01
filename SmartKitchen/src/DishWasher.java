public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher() {}

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.printf("Dishes beign washed! SHhh ShShhsh Shhh\n");
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
