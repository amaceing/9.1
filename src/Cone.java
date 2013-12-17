//Anthony Mace  CSC205AB
//This program ...


public class Cone extends Shape {
    private double _radius;
    private double _sideLength;

    public Cone(double height, double radius, double sideLength) {
        super(height);
        _radius = radius;
        _sideLength = sideLength;
    }

    public double getRadius() {
        return _radius;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double calculateSurfaceArea() {
        return (Math.PI * _radius * _sideLength) +
               (Math.PI * Math.pow(_radius, 2));
    }

    @Override
    public double calculateVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(_radius, 2) * getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Height: " + getHeight() + "\n" +
               "Radius: " + _radius + "\n" +
               "Length of side: " + _sideLength;
    }
}
