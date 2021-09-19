package pl.mikbac.java_13;

/**
 * === REQUIRED JDK 13 (non-LTS) ===
 * <p>
 * Premier Support Until -> March 2020
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
