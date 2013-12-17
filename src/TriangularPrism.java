//Anthony Mace  CSC205AB
//This program ...


public class TriangularPrism extends Prism {
    private double _length;
    private double _base;
    private double _side;

    public TriangularPrism(double height, double length, double base,
                           double side) {
        super(height);
        _length = length;
        _base = base;
        _side = side;
    }

    public double getBase() {
        return _base;
    }

    public double getLength() {
        return _length;
    }

    public double getSide() {
        return _side;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double calculateSurfaceArea() {
        double surfArea = 0.0;
        surfArea = (_base * getHeight()) + (2 * _length * _side) + (_length * _base);
        return surfArea;
    }

    @Override
    public double calculateVolume() {
        double volume = 0.0;
        volume = (1.0/2.0) * (_base * getHeight() * _length);
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Length: " + _length + "\n" +
               "Base: " + _base + "\n" +
               "Side: " + _side;
    }
}
