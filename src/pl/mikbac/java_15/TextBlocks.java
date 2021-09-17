package pl.mikbac.java_15;

/**
 * === REQUIRED JDK 15 (non-LTS) ===
 * <p>
 * Premier Support Until -> March 2021
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
