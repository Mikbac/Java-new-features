package pl.mikbac.java_21;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 21 (LTS) ===
 * <p>
 * Premier Support Until -> September 2028
 * Extended Support Until -> September 2031
 */

public class PatternMatchingForSwitch {

    public static void main(String[] args) {
        var t1 = formatterPatternSwitch("xyz");
        System.out.println(t1); // String xyz

        var t2 = formatterPatternSwitch(1.1);
        System.out.println(t2); // double 1,100000

        var t3 = formatterPatternSwitch(new BigDecimal(17));
        System.out.println(t3); // BigDecimal 17
    }

    static String formatterPatternSwitch(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            case BigDecimal bg -> String.format("BigDecimal %s", bg);
            default -> obj.toString();
        };

    }
}
