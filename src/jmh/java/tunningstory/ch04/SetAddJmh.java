package tunningstory.ch04;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class SetAddJmh {
    SetAdd setAdd = new SetAdd();
    @Benchmark
    public void addHashSet(Blackhole bh) {
        bh.consume(setAdd.addHashSet());
    }

    @Benchmark
    public void addTreeSet(Blackhole bh) {
        bh.consume(setAdd.addTreeSet());
    }
    @Benchmark
    public void addLinkedListSet(Blackhole bh) {
        bh.consume(setAdd.addLinkedHashSet());
    }
}
