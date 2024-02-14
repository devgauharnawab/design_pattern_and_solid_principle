package out.production.design_pattern_and_solid_principle.open_closed_principle.example2;

public class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
