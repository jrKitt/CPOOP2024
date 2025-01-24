/*
 * 
 * 
 *  	นายกิตติชัย รักษาวงค์
 * 		673380028-2
 * 		Section 1
 * 
 * 
 * 
 * */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(int x_left, int y_left, double radius){
        super(x_left,y_left);
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }}
