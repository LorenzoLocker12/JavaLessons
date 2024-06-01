public class Bed {
    private String style;
    private int pilllows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pilllows, int height, int sheets, int quilt) {
        this.style = style;
        this.pilllows = pilllows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.print("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPilllows() {
        return pilllows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
