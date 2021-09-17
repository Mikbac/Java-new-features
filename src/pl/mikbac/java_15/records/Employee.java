package pl.mikbac.java_15.records;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 15 (non-LTS) ===
 * <p>
 * Premier Support Until -> March 2021
 * Extended Support Until -> Not Available
 */
public record Employee(String id, String name, BigDecimal salary) {
//    contains: getters, setters, constructor, equals, hashcode, toString
}
