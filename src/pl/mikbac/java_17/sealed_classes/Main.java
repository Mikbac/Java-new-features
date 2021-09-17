package pl.mikbac.java_17.sealed_classes;

import pl.mikbac.java_17.sealed_classes.model.ManagerModel;
import pl.mikbac.java_17.sealed_classes.model.WorkerModel;

import java.math.BigDecimal;

/**
 * === REQUIRED JDK 17 (LTS) ===
 * <p>
 * Premier Support Until -> September 2026 (Or later)
 * Extended Support Until -> September 2029 (Or later)
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
