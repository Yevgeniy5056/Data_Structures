package LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    int size;
    int capacity;
    DNode head;
    DNode tail;
    Map<Integer, DNode> cacheMap = new HashMap<>();

    public class DNode {
        int key;
        int value;
        DNode next;
        DNode prev;

        public DNode() {
        }

        public DNode(int value, int key) {
            this.value = value;
            this.key = key;
        }


    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new DNode();
        this.tail = new DNode();
        this.head.next = tail;
        this.tail.next = head;
    }

    public void addNode(DNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void remove(DNode node) {
        DNode prev = node.prev;
        DNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void moveToHead(DNode node) {
        remove(node);
        addNode(node);
    }

    public DNode popTail() {
        DNode popped = tail.prev;
        remove(popped);
        return popped;
    }

    public int get(int key) {
        DNode node = cacheMap.get(key);
        if (node == null) return -1;
        else {
            moveToHead(node);
            return node.value;
        }
    }

    public void put(int key, int value) {
        DNode node = cacheMap.get(key);
        if (node == null) {
            DNode newNode = new DNode(key, value);
            cacheMap.put(key, newNode);
            addNode(newNode);
            size++;
            if (size > capacity) {
                DNode last = popTail();
                cacheMap.remove(last.key);
                size--;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    void printLRUCache() {
        for (Map.Entry<Integer, DNode> entry : cacheMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().value);
        }
    }
}

