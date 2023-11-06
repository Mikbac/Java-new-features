package pl.mikbac.java_17;

/**
 * === REQUIRED JDK 17 (LTS) ===
 * <p>
 * Premier Support Until -> September 2026 (Or later)
 * Extended Support Until -> September 2029 (Or later)
 */
public class PatternMatching {

    public static void main(String[] args) {
        var s1 = getTestOne("12");
        System.out.println(s1); // String

        var s2 = getTestTwo("1200");
        System.out.println(s2); // 1200 is a big String

        var s3 = getTestThree("12");
        System.out.println(s3); // 12 is a small String

        var s4 = getTestFour(null);
        System.out.println(s4); // It is null!

    }

    private static String getTestOne(final Object obj) {
        return switch (obj) {
            case Integer i -> "Integer";
            case String s -> "String";
            default -> "Unknown";
        };
    }

    private static String getTestTwo(final Object obj) {
        return switch (obj) {
            case Integer i when i < 10 -> "small Integer";
            case String s1 when s1.length() >= 3 -> s1 + " is a big String";
            case String s2 when s2.length() < 3 -> s2 + " is a small String";
            default -> "Unknown";
        };
    }

    private static String getTestThree(final String s) {
        return switch (s) {
            case String s1 when s1.length() >= 3 -> s1 + " is a big String";
            case String s2 when s2.length() < 3 -> s2 + " is a small String";
            default -> "Unknown";
        };
    }

    private static String getTestFour(final String s) {
        return switch (s) {
            case String s1 when s1.length() >= 3 -> s1 + " is a big String";
            case String s2 when s2.length() < 3 -> s2 + " is a small String";
            case null -> "It is null!";
            default -> "Unknown";
        };
    }
}
