package out.production.design_pattern_and_solid_principle.open_closed_principle.example2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(5, 4), new Circle(3)};
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}
