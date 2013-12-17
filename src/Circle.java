//Anthony Mace  CSC205AB
//This program ...


public class Circle implements TwoDShapes {
    private double _radius;

    public Circle(double radius) {
        _radius = radius;
    }

    public double getRadius() {
        return _radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(_radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * _radius;
    }

    @Override
    public String toString() {
        return "Radius: " + _radius;
    }
}
