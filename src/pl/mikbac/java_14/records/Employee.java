package pl.mikbac.java_14.records;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 14 (non-LTS) ===
 * <p>
 * Premier Support Until -> September 2020
 * Extended Support Until -> Not Available
 */
public record Employee(String id, String name, BigDecimal salary) {
    //    contains: getters, setters, constructor, equals, hashcode, toString
}
