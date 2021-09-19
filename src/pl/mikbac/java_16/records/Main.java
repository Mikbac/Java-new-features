package pl.mikbac.java_16.records;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 16 (non-LTS) ===
 * <p>
 * Premier Support Until -> September 2021
 * Extended Support Until -> Not Available
 */
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("11", "Andre1", BigDecimal.valueOf(1000.50));

        System.out.println(employee.id());
        System.out.println(employee.name());
        System.out.println(employee.salary());

        System.out.println(employee);

        // --------------------------------------------------------------------------
        System.out.println("--------------------------------------------------------------------------");
        // --------------------------------------------------------------------------

        Color color = new Color("red-1", "red");

        System.out.println(color.id());
        System.out.println(color.name());

        System.out.println(color);

    }

    public record Color(String id, String name) {
    }

}
