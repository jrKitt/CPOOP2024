/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */

public class Triangle extends Shape{
    private double base;
    private double height;
    private double c;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height, double c){
        this.base = base;
        this.height = height;
        this.c = c;
    }


    public Triangle(int x_left, int y_left, double base, double height){
        super(x_left,y_left);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        c = Math.sqrt(base*base + height*height);
        return base + height + c;
    }
    public double getArea(){
        return 0.5 * base * height;
    }}

