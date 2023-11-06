package pl.mikbac.java_21.virtual_threads;

/**
 * === REQUIRED JDK 21 (LTS) ===
 * <p>
 * Premier Support Until -> September 2028
 * Extended Support Until -> September 2031
 */

public class VirtualThreads {

    public static void main(String[] args) {
        Thread virtualThread = Thread.ofVirtual().name("virtual").unstarted(new SampleRunnable());
        Thread platformThread = Thread.ofPlatform().name("platform").unstarted(new SampleRunnable());
    }

}
