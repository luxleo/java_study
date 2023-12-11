package tunningstory.ch04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tunningstory.MetricUtil;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetAddTest {
    SetAdd setAdd;
    private final MetricUtil util = new MetricUtil();
    @Test
    @DisplayName("hashset 검사")
    void hashSet() {
        long start = System.currentTimeMillis();
        util.printHeap(0);
        setAdd = new SetAdd();
        Set result = setAdd.addHashSet();
        System.out.println("result = " + result.size());
        long end = System.currentTimeMillis();
        util.printHeap(1);
        util.printHeap(2);
        System.out.printf("걸린시간: %d\t",end-start);
    }
}