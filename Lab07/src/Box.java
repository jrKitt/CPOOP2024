/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */

import java.util.ArrayList;
import java.util.List;

public class Box {

    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public double getTotalCircumference() {
        double totalCircumference = 0;
        for (Shape shape : shapes) {
            totalCircumference += shape.getCircumference();
        }
        return totalCircumference;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
}
