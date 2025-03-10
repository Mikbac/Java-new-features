package pl.mikbac.java_21;

/**
 * Created by MikBac on 10.03.2025
 */
public class RecordPatterns {

    // You can use a record pattern to test whether a value is an instance of a record class type.
    // https://docs.oracle.com/en/java/javase/22/language/record-patterns.html
    public static void main(String[] args) {
        Rectangle.printRectangleArea(new Rectangle(20, 30));
    }

}
