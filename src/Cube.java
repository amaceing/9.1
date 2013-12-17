//Anthony Mace  CSC205AB
//This program ...


public class Cube extends Prism {

    public Cube(double height) {
        super(height);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(getHeight(), 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getHeight(), 3);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
