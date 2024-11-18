package ch.bbw.lr;

public class AreaService {
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateTrapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }

    public static double calculateParallelogramArea(double base, double height) {
        return base * height;
    }

    public static double calculateEllipseArea(double majorAxis, double minorAxis) {
        return Math.PI * majorAxis * minorAxis;
    }

    public static double calculateSectorArea(double radius, double angle) {
        return 0.5 * radius * radius * angle;
    }
}
