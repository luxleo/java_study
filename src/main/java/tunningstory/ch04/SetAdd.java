package tunningstory.ch04;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;


public class SetAdd {
    int LOOP_CNT = 10000;
    Set<String> set;
    String data = "abcdefghijklmnopqrstuvwxyz";

    public Set addHashSet() {
        set = new HashSet<>();
        for (int i = 0; i < LOOP_CNT; i++) {
            set.add(data + i);
        }
        return this.set;
    }
    public int addTreeSet() {
        set = new TreeSet<>();
        for (int i = 0; i < LOOP_CNT; i++) {
            set.add(data + i);
        }
        return 0;
    }
    public int addLinkedHashSet() {
        set = new LinkedHashSet<>();
        for (int i = 0; i < LOOP_CNT; i++) {
            set.add(data + i);
        }
        return 1;
    }
}
