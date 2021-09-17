package com.company.java_12;

/**
 * === REQUIRED JDK 12 (non-LTS)  ===
 * <p>
 * Premier Support Until -> September 2019
 * Extended Support Until -> Not Available
 */
public class SwitchExpressions {

    public static void main(String[] args) {
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
