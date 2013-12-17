//Anthony Mace  CSC205AB
//This files represents a
//Rectangular prism


public class RectangularPrism extends Prism {
    private double _length;
    private double _width;

    public RectangularPrism(double height, double length, double width) {
        super(height);
        _length = length;
        _width = width;
    }

    public double getLength() {
        return _length;
    }

    public double getWidth() {
        return _width;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double calculateSurfaceArea() {
        double surfArea = 0.0;
        surfArea = 2 * ((_width * getHeight()) + (_length * _width) + (_length * getHeight()));
        return surfArea;
    }

    @Override
    public double calculateVolume() {
        double volume = 0.0;
        volume = getHeight() * _length * _width;
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Length: " + _length + "\n" +
               "Width: " + _width;
    }
}
