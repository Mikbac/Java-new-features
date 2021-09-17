package com.company.java_17.sealed_classes.model;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 17 (LTS) ===
 * <p>
 * Premier Support Until -> September 2026 (Or later)
 * Extended Support Until -> September 2029 (Or later)
 */
public abstract sealed class AbstractEmployee permits ManagerModel, WorkerModel {

    private String id;
    private String name;
    private BigDecimal salary;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(final BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
