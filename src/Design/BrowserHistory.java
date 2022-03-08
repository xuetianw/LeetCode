package Design;

import java.util.ArrayList;
import java.util.List;

// 1472. Design Browser History
class BrowserHistory {
    List<String> list;
    int loc = -1;

    public BrowserHistory(String homepage) {
        list = new ArrayList<>();
        list.add(homepage);
        loc = list.size() - 1;
    }

    public void visit(String url) {
        int count = list.size() - 1 - loc;
        for (int i = 0; i < count; i++) {
            list.remove(list.size() - 1);
        }
        list.add(url);
        loc = list.size() - 1;
    }

    public String back(int steps) {
        if (loc < steps) {
            loc = 0;
            return list.get(0);
        } else {
            loc -= steps;
            return list.get(loc);
        }
    }

    public String forward(int steps) {
        if (steps > list.size() - 1 - loc) {
            loc = list.size() - 1;
        } else {
            loc += steps;
        }
        return list.get(loc);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */