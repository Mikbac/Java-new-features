package com.company.java_17;

/**
 * === REQUIRED JDK 17 (LTS) ===
 * <p>
 * Premier Support Until -> September 2026 (Or later)
 * Extended Support Until -> September 2029 (Or later)
 */
public class PatternMatching {

    public static void main(String[] args) {
        var s1 = getTestOne("12");
        System.out.println(s1);

        var s2 = getTestTwo("1200");
        System.out.println(s2);

        var s3 = getTestThree("12");
        System.out.println(s3);

        var s4 = getTestFour(null);
        System.out.println(s4);

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
            case Integer i && i < 10 -> "small Integer";
            case String s1 && s1.length() >= 3 -> s1 + " is a big String";
            case String s2 && s2.length() < 3 -> s2 + " is a small String";
            default -> "Unknown";
        };
    }

    private static String getTestThree(final String s) {
        return switch (s) {
            case String s1 && s1.length() >= 3 -> s1 + " is a big String";
            case String s2 && s2.length() < 3 -> s2 + " is a small String";
            default -> "Unknown";
        };
    }

    private static String getTestFour(final String s) {
        return switch (s) {
            case String s1 && s1.length() >= 3 -> s1 + " is a big String";
            case String s2 && s2.length() < 3 -> s2 + " is a small String";
            case null -> "It is null!";
            default -> "Unknown";
        };
    }
}
