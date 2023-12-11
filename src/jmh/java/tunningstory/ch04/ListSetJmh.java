package tunningstory.ch04;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class ListSetJmh {
    ListTest listTest = new ListTest();
    @Benchmark
    public void addArrayList(Blackhole bh) {
        bh.consume(listTest.addArrList());
    }

    @Benchmark
    public void addVector(Blackhole bh) {
        bh.consume(listTest.addVector());
    }
    @Benchmark
    public void addLinkedList(Blackhole bh) {
        bh.consume(listTest.addLinkedList());
    }
}
