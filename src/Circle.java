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
    public int calculateArea() {
        int area = 0;
        double calcArea= 0.0;
        calcArea = (Math.PI * Math.pow(_radius, 2)) + 0.5;
        area = (int) calcArea;
        return area;
    }

    @Override
    public int calculatePerimeter() {
        int per = 0;
        double calcPer = 0.0;
        calcPer = (2 * Math.PI * _radius) + 0.5;
        per = (int) calcPer;
        return per;
    }

    @Override
    public String toString() {
        return "Radius: " + _radius;
    }
}
