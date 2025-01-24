/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = height;
        this.height = width;
    }

    public Rectangle(int x_left, int y_left, double width, double height){
        super(x_left,y_left);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width * height);
    }
    public double getArea(){
        return width * height;
    }}
