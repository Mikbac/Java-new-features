package pl.mikbac.java_14;

/**
 * === REQUIRED JDK 14 (non-LTS) ===
 * <p>
 * Premier Support Until -> September 2020
 * Extended Support Until -> Not Available
 */
public class PatternMatchingInstanceof {

    public static void main(String[] args) {
        Object obj = "Pankracy";
        if (obj instanceof String string) {
            // "(String)"  is not required
            System.out.println(string);
        } else {

        }
    }
}
