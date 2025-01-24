public class Shape {
    private int x_left;
    private int y_left;

    public Shape(){
        this.x_left = 0;
        this.y_left = 0;
    }
    public Shape(int x_left, int y_left){
        this.x_left = x_left;
        this.y_left = y_left;
    }

    public double getCircumference() {
        return 0;
    }
    public double getArea(){
        return 0;
    }

    public int getX_left() {
        return x_left;
    }

    public void setX_left(int x_left) {
        this.x_left = x_left;
    }

    public int getY_left() {
        return y_left;
    }

    public void setY_left(int y_left) {
        this.y_left = y_left;
    }
}
