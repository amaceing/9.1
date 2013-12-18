//Anthony Mace  CSC205AB
//This program ...

import java.awt.*;

abstract class SimpleShape implements TwoDShapes {
    private static final int X_DIMENSION = 950;
    private static final int Y_DIMENSION = 950;
    private DrawingPanel _panel = new DrawingPanel(X_DIMENSION, Y_DIMENSION);
    private Graphics _plane = _panel.getGraphics();
    private int AXES_LINE_OFFSET = 10;

    public int getXDim() {
        return X_DIMENSION;
    }

    public int getYDim() {
        return Y_DIMENSION;
    }

    public DrawingPanel getPanel() {
        return _panel;
    }

    public Graphics getPlane() {
        return _plane;
    }

    public int getOffset() {
        return AXES_LINE_OFFSET;
    }

    public void setUpPlane() {
        _plane.setColor(Color.darkGray);
        _plane.drawLine(getOffset(), 0, getOffset(), getYDim());
        _plane.drawLine(0, getOffset(), getXDim(), getOffset());
    }
}
