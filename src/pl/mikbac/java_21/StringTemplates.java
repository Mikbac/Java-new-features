package pl.mikbac.java_21;

import static java.lang.StringTemplate.STR;

/**
 * === REQUIRED JDK 21 (LTS) ===
 * <p>
 * Premier Support Until -> September 2028
 * Extended Support Until -> September 2031
 */

public class StringTemplates {

    public static void main(String[] args) {
        String name = "Joan";
        String info = STR."My name is \{name}";
        System.out.println(info);   // My name is Joan
    }

}
