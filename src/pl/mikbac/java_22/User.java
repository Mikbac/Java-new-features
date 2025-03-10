package pl.mikbac.java_22;

/**
 * Created by MikBac on 10.03.2025
 */
public record User(String firstName, String lastName) {
    static void printUserLastName(Object obj) {
        // Unnamed Patterns
        if (obj instanceof User(_, String lastName)) {
            System.out.println(lastName);
        }
    }
}
