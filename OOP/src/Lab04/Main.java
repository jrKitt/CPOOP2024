package Lab04;

public class Main {
    public static void main(String[] args) {
        Rectangle[] r = new Rectangle[3];
        r[0] = new Rectangle(3.5, 2);
        r[1] = new Rectangle(1.5, 4);
        r[2] = new Rectangle(2.5, 5);
        double totalArea = totalRectangleArea(r);
        System.out.println("The total area of rectangle is " + totalArea);
    }

    public static double totalRectangleArea(Rectangle[] rectangles) {
        double res = 0;
        for (Rectangle rect : rectangles) {
            res += rect.getW() * rect.getL(); 
        }
        return res;
    }
}
