package pl.mikbac.java_16.records;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 16 (non-LTS) ===
 * <p>
 * Premier Support Until -> September 2021
 * Extended Support Until -> Not Available
 */
public record Employee(String id, String name, BigDecimal salary) {
    //    contains: getters, setters, constructor, equals, hashcode, toString
}
