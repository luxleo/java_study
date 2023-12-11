package tunningstory;

public class MetricUtil {
    private static Runtime rt = Runtime.getRuntime();

    public long printHeap(int idx) {
        rt.gc();
        long f = rt.freeMemory();
        long t = rt.totalMemory();
        System.out.println(String.format("%dth Heap size : %,8d bytes", idx, t - f));
        return t - f;
    }
}
