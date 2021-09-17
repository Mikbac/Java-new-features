package com.company.java_14;

/**
 * === REQUIRED JDK 14 (non-LTS) ===
 * <p>
 * Premier Support Until -> September 2020
 * Extended Support Until -> Not Available
 */
public class SwitchExpressions {

    public static void main(String[] args) {
        exampleOne();

        exampleTwo();

    }

    private static void exampleOne() {
        Integer n = 1;
        String label = switch (n) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            default -> "unknown";
        };
        System.out.println(label);
    }

    private static void exampleTwo() {
        Integer s = 2;
        switch (s) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            default -> System.out.println("unknown");
        }
    }

}
