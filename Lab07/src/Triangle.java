public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(){
        this.width = 0;
        this.height = 0;
    }

    public Triangle(int x_left, int y_left, double width, double height){
        super(x_left,y_left);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.sqrt(width*width + height*height);
    }
    public double getArea(){
        return (width*width + height*height);
    }}
