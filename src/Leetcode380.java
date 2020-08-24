import java.util.*;

public class Leetcode380 {

    class RandomizedSet {

        Set<Integer> set;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            set = new HashSet<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (set.contains(val)) {
                return false;
            } else {
                set.add(val);
                return true;
            }
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            return set.remove(val);
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int index = new Random().nextInt(set.size());
            return (Integer) set.toArray()[index];
        }
    }
}
