package out.production.design_pattern_and_solid_principle.liskov_substitution_principle;

class Shape {
    public int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return width * height;
    }
}

class Square extends Shape {
    protected int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
 class MainShape {
    static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        printArea(rectangle); // Output: Area: 20

        Square square = new Square(5);
        printArea(square); // Output: Area: 25

        // Now, let's use a Square object as if it were a Rectangle
        Shape shape = new Square(5);
        printArea(shape); // Output: Area: 25

        // We can see that even though we passed a Square object, the behavior is as expected.
        // This demonstrates the Liskov Substitution Principle.
    }
}

