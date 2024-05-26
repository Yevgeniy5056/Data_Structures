package QueueAndHashMapReview;

import java.util.LinkedList;

public class Bucket {

    LinkedList<KeyValue<Integer, Integer>> bucket;

    public Bucket() {
        this.bucket = new LinkedList<>();
    }

    public int get(int key) {
        for (KeyValue<Integer, Integer> pair : bucket) {
            if (pair.key.equals(key)) {
                return pair.val;
            }
        }
        return -1;
    }

    public void put(int key, int val) {
        for (KeyValue<Integer, Integer> pair : bucket) {
            if (pair.key.equals(key)) {
                pair.val = val;
                return;
            }
        }
        this.bucket.add(new KeyValue<>(key, val));
    }

    public void remove(int key) {
        for (KeyValue<Integer, Integer> pair : bucket) {
            if (pair.key.equals(key)) {
                this.bucket.remove(pair);
                return;
            }
        }
    }
}
