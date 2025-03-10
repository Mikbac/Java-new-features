package pl.mikbac.java_22;

/**
 * Created by MikBac on 10.03.2025
 */
public class UnnamedVariables {

    public static void main(String[] args) {
        // Unnamed Variables
        for (int i = 0, _ = 10; i < 5; i++) {
            // do something
        }

        var _ = 10;

        // Unnamed Patterns
        User.printUserLastName(new User("aaa", "bbb")); // bbb

    }

}
