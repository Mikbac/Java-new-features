package pl.mikbac.java_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * === REQUIRED JDK 11 (LTS) ===
 * <p>
 * Premier Support Until -> September 2023
 * Extended Support Until -> September 2026
 */
public class LocalVariableSyntax {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aaa", "bbb", "ccc");

        String result = stringList.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

}
