public class ShapeInheritance {
    interface Shape { double area(); }
    static class Circle implements Shape { double radius; Circle(double r) { radius = r; } public double area() { return Math.PI * radius * radius; } }
    static class Rectangle implements Shape { double width, height; Rectangle(double w, double h) { width = w; height = h; } public double area() { return width * height; } }
    public static void main(String[] args) { System.out.println("Circle: " + new Circle(3).area()); System.out.println("Rectangle: " + new Rectangle(4, 5).area()); }
}
