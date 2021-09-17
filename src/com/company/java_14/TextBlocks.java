package com.company.java_14;

/**
 * === REQUIRED JDK 14 (non-LTS) ===
 * <p>
 * Premier Support Until -> September 2020
 * Extended Support Until -> Not Available
 */
public class TextBlocks {

    public static void main(String[] args) {
        String s = """
                aaa1 aaa2 aaa3 \
                bbb2 bbb2 \
                ccc3 \
                """;
        System.out.println(s);
    }

}
