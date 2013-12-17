//Anthony Mace  CSC205AB
//This program ...


abstract class Shape implements ThreeDShapes {
    private double _height;

    public Shape(double height) {
        _height = height;
    }

    public double getHeight() {
        return _height;
    }

    abstract public double calculateSurfaceArea();

    abstract public double calculateVolume();

    public String toString() {
        return "Height: " + _height;
    }
}
