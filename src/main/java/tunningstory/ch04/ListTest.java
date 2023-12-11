package tunningstory.ch04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
    int LOOP_CNT = 10000;
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> vector = new Vector<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public int addArrList() {
        for (int i = 0; i < LOOP_CNT; i++) {
            arrayList.add(i);
        }
        return 1;
    }
    public int addVector() {
        for (int i = 0; i < LOOP_CNT; i++) {
            vector.add(i);
        }
        return 1;
    }
    public int addLinkedList() {
        for (int i = 0; i < LOOP_CNT; i++) {
            linkedList.add(i);
        }
        return 1;
    }

    public int getArrList() {
        for (int i = 0; i < LOOP_CNT; i++) {
            arrayList.get(i);
        }
        return 1;
    }
    public int getVector() {
        for (int i = 0; i < LOOP_CNT; i++) {
            vector.get(i);
        }
        return 1;
    }
    public int getLinkedList() {
        for (int i = 0; i < LOOP_CNT; i++) {
            linkedList.get(i);
        }
        return 1;
    }
    public int peekLinkedList() {
        for (int i = 0; i < LOOP_CNT; i++) {
            linkedList.poll();
        }
        return 1;
    }
}
