package pl.mikbac.java_21.virtual_threads;

/**
 * Created by MikBac on 06.11.2023
 */
public class SampleRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + ", executing run() method!");
    }

}
