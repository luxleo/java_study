package tunningstory.ch04;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class ListGetJmh {
    ListTest listTest = new ListTest();

    @Setup
    public void init() {
        listTest.addArrList();
        listTest.addLinkedList();
        listTest.addVector();
    }
    @Benchmark
    public void getArrayList(Blackhole bh) {
        bh.consume(listTest.getArrList());
    }

    @Benchmark
    public void getVector(Blackhole bh) {
        bh.consume(listTest.getVector());
    }
    @Benchmark
    public void getLinkedList(Blackhole bh) {
        bh.consume(listTest.getLinkedList());
    }
    @Benchmark
    public void peekLinkedList(Blackhole bh) {
        bh.consume(listTest.peekLinkedList());
    }
}
