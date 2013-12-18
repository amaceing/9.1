//Anthony Mace  CSC205AB
//This program is designed to allow the user
//to create and store 3D shapes

import java.util.*;
import java.awt.*;

public class Project1 {

    public static final Scanner console = new Scanner(System.in);
    public static final int Y_DIMENSION = 950;
    public static final int X_DIMENSION = 950;

    public static void main(String[] args) {
        drawRectangle();
        drawOval();
    }

    public static void drawRectangle() {
        System.out.println("You chose to draw a rectangle!");
        int length = getUserLength();
        int width = getUserWidth();
        Rectangle rect = new Rectangle(width, length);
        int xCoord = getXCoordinate();
        int yCoord = getYCoordinate();
        rect.drawSelf(xCoord, yCoord);
        System.out.println();
    }

    public static void drawOval() {
        System.out.println("You chose to draw a circle!");
        int length = getUserLength();
        int width = getUserWidth();
        Oval oval = new Oval(width, length);
        int xCoord = getXCoordinate();
        int yCoord = getYCoordinate();
        oval.drawSelf(xCoord, yCoord);
        System.out.println();
    }

    public static int getUserLength() {
        int length = 0;
        do {
            System.out.print("Enter the length of the shape (in.): ");
            length = console.nextInt();
            if (length >= Y_DIMENSION) {
                System.out.println("This is too tall!");
                System.out.println();
            }
        } while(length >= Y_DIMENSION);
        System.out.println();
        return length;
    }

    public static int getUserWidth() {
        int width = 0;
        do {
            System.out.print("Enter the width of the shape (in.): ");
            width = console.nextInt();
            if (width >= X_DIMENSION) {
                System.out.println("This is too wide!");
                System.out.println();
            }
        } while(width >= X_DIMENSION);
        System.out.println();
        return width;
    }

    public static int getXCoordinate() {
        int x = 0;
        do {
            System.out.print("Enter the x coordinate: ");
            x = console.nextInt();
            if (x >= X_DIMENSION) {
                System.out.println("That x coordinate is too large for the window!");
            }
        } while(x >= X_DIMENSION);
        System.out.println();
        return x;
    }

    public static int getYCoordinate() {
        int y = 0;
        do {
            System.out.print("Enter the y coordinate: ");
            y = console.nextInt();
            if (y >= Y_DIMENSION) {
                System.out.println("That y coordinate is too large for the window!");
            }
        } while(y >= Y_DIMENSION);
        System.out.println();
        return y;
    }

}
