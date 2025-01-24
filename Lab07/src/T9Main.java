/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */

public class T9Main {
    public static void main(String[] args) {

        Box box1 = new Box();
        box1.add(new Circle(7));
        System.out.println("Circle Box");
        System.out.format("Total area\t\t %.3f\n" ,box1.getTotalArea());
        System.out.format("Total circumference\t %.3f\n\n" ,box1.getTotalCircumference());

        Box box2 = new Box();
        box2.add(new Rectangle(4,5));
        box2.add(new Rectangle(10,20));
        System.out.println("Rectangle Box");
        System.out.printf("Total area\t\t %.3f\n" ,box2.getTotalArea());
        System.out.printf("Total circumference\t %.3f\n\n" ,box2.getTotalCircumference());

// สามเหลี่ยมมุมฉาก
        Box box3 = new Box();
        box3.add(new Triangle(3,4));
        box3.add(new Triangle(5,12,13));
        System.out.println("Triangle Box");
        System.out.printf("Total area\t\t %.3f\n" ,box3.getTotalArea());
        System.out.printf("Total circumference\t %.3f\n\n" ,box3.getTotalCircumference());
    }
}