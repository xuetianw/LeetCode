package Design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MaxStack {
    List<Integer> list;

    public MaxStack() {
        list = new ArrayList();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int copy = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return copy;
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int peekMax() {
        int max_soFar = list.get(list.size() - 1);
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) > max_soFar) {
                max_soFar = list.get(i);
            }
        }
        return max_soFar;
    }

    public int popMax() {
        int max_soFar = list.get(list.size() - 1);
        int maxI = list.size() - 1;
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) > max_soFar) {
                max_soFar = list.get(i);
                maxI = i;
            }
        }
        list.remove(maxI);
        return max_soFar;
    }
}