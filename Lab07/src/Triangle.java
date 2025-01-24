/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Triangle(int x_left, int y_left, double width, double height){
        super(x_left,y_left);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return Math.sqrt(width*width + height*height);
    }
    public double getArea(){
        return (width*width + height*height);
    }}

