public class MyHashMap {
    /**
     * Initialize your data structure here.
     */

    Item[] hashTable; //creating a chain hash table that has size of 100

    void collision(int index, Word newElement) {
        Item newNode = new Item(newElement);
        Item temp = hashTable[index];
        if (temp.next == null) {
            System.out.println("collision happening at index " + index);
            temp.next = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("here comes collision again  at " + index + " " + temp.next.data.value);
        }
    }

    class Word {
        public Word(int key, int value) {
            this.key = key;
            this.value = value;
        }

        int key;
        int value;
    }

    class Item {
        Item() {

        }

        Item(Word newdata) {
            data = newdata;
        }

        Word data;
        Item next;
    }

    public MyHashMap() {
        hashTable = new Item[1000000];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        System.out.println(key);
        if (hashTable[key] == null) {
            hashTable[key] = new Item(new Word(key, value));
        } else {
            collision(key, new Word(key, value));
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        if (hashTable[key] == null) {
            return -1;
        } else {
            Item current = hashTable[key];
            while (current != null) {
                if (current.data.key == key)
                    return current.data.value;
                current = current.next;
            }
            return -1;
        }
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {

        Item head = hashTable[key];
        if (head == null) {
            System.out.println("not found");
            return;
        }

        if (head.data.key == key) {
            head = head.next;
            return;
        }

        Item prev = head;
        Item current = head.next;
        while (current != null) {
            if (current.data.key == key) {
                prev.next = prev.next.next;
                current = current.next;
                prev = prev.next;
                return;
            }
            current = current.next;
            prev = prev.next;
        }

    }

    public static void main(String[] args) {
            MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.get(1);            // returns 1
        hashMap.get(3);            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        hashMap.get(2);            // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        hashMap.get(2);            // returns -1 (not found)
    }

//    MyHashMap hashMap = new MyHashMap();
//hashMap.put(1, 1);
//hashMap.put(2, 2);
//hashMap.get(1);            // returns 1
//hashMap.get(3);            // returns -1 (not found)
//hashMap.put(2, 1);          // update the existing value
//hashMap.get(2);            // returns 1
//hashMap.remove(2);          // remove the mapping for 2
//hashMap.get(2);            // returns -1 (not found)

}