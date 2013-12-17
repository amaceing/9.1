//Anthony Mace  CSC205AB
//This program ...


public class Cylinder extends Shape {
    private double _radius;

    public Cylinder(double height, double radius) {
        super(height);
        _radius = radius;
    }

    public double getRadius(){
        return _radius;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double calculateSurfaceArea() {
        return (2 * Math.PI * _radius * getHeight()) +
               (2 * Math.PI * Math.pow(_radius, 2));
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(_radius, 2) * getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Height: " + getHeight() + "\n" +
               "Radius: " + _radius;
    }
}
