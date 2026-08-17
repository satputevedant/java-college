interface Drawable {
    void draw();
}

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape implements Drawable {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " Circle.");
    }
}

class Rectangle extends Shape implements Drawable {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " Rectangle.");
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5.5);
        c.draw();
        c.calculateArea();

        Rectangle r = new Rectangle("Blue", 4.0, 6.0);
        r.draw();
        r.calculateArea();
    }
}
