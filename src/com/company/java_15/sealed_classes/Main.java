package com.company.java_15.sealed_classes;

import com.company.java_15.sealed_classes.model.ManagerModel;
import com.company.java_15.sealed_classes.model.WorkerModel;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 15 (non-LTS) ===
 * <p>
 * Premier Support Until -> March 2021
 * Extended Support Until -> Not Available
 */
public class Main {

    public static void main(String[] args) {
        ManagerModel managerModel = new ManagerModel();
        WorkerModel workerModel = new WorkerModel();

        managerModel.setId("11");
        managerModel.setName("Pankracy");
        managerModel.setSalary(BigDecimal.valueOf(2000.50));

        workerModel.setId("22");
        workerModel.setName("Henry");
        workerModel.setSalary(BigDecimal.valueOf(1000.00));

        System.out.println(managerModel);
        System.out.println(workerModel);
    }

}
