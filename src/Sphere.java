//Anthony Mace  CSC205AB
//This program ...


public class Sphere implements ThreeDShapes {
    public double _radius;

    public Sphere(double radius) {
        _radius = radius;
    }

    public double getRadius() {
        return _radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(_radius, 2);
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(_radius, 3);
    }

    @Override
    public String toString() {
        return "Radius: " + _radius;
    }
}
