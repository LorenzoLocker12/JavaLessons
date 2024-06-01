public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {}

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(String food){
        if(hasWorkToDo){
            System.out.printf("Food: %s, has succecssfully beign ordered\n", food);
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
