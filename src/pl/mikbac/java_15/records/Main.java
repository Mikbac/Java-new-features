package pl.mikbac.java_15.records;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 15 (non-LTS) ===
 * <p>
 * Premier Support Until -> March 2021
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

    }

    public record Color(String id, String name) {
    }

}
