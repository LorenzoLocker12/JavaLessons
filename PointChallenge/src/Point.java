public class Point {
    private int x;
    private int y;

// d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

    public double distance(){
        return Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));
    }

    public double distance(Point point){
        double newX = point.getX();
        double newY = point.getY();

        return Math.sqrt((newX - this.x) * (newX - this.x) + (newY - this.y) * (newY - this.y));
    }

    public double distance(double newX, double newY){
        return Math.sqrt((newX - this.x) * (newX - this.x) + (newY - this.y) * (newY - this.y));
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
