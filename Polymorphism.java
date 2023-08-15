// The base class representing a shape
class Shape {
    // The draw method of the base class
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// A subclass representing a circle, inheriting from Shape
class Circle extends Shape {
    // Override the draw method to provide circle-specific implementation

    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// A subclass representing a square, inheriting from Shape
class Square extends Shape {
    // Override the draw method to provide square-specific implementation

    public void draw() {
        System.out.println("Drawing a square");
    }
}

// Main class to demonstrate polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        // Create a Circle instance and store it in a Shape reference
        Shape shape1 = new Circle();

        // Create a Square instance and store it in a Shape reference
        Shape shape2 = new Square();

        // Call the draw method on the Circle instance (polymorphism in action)
        shape1.draw();  // Calls the overridden draw() method of Circle

        // Call the draw method on the Square instance (polymorphism in action)
        shape2.draw();  // Calls the overridden draw() method of Square
    }
}

