/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */

public class T9Main {
    public static void main(String[] args) {

        Box box = new Box();
        box.add(new Circle(2.5));
        box.add(new Circle(1.5));
        box.add(new Circle(1.0));

        box.add(new Rectangle(6.0, 2.0));
        box.add(new Triangle(6.0, 2.0));

        System.out.printf("Total area\t\t %.3f\n" ,box.getTotalArea());
        System.out.printf("Total circumference\t %.3f" ,box.getTotalCircumference());
    }
}