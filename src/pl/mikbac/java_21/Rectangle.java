package pl.mikbac.java_21;

/**
 * Created by MikBac on 10.03.2025
 */
public record Rectangle(int width, int height) {

    static void printRectangleArea(Object obj) {
        if (obj instanceof Rectangle(int width, int height)) {
            // extracts the width and height values from obj directly,
            // automatically calling the Rectangle record's accessor methods
            System.out.println("Rectangle:" + width * height);
        }
    }

}
