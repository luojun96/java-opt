package org.jun.algorithms.linkedlist;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private int size;
    private Node head, tail;
    private Map<Integer, Node> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.previous = head;
        this.cache = new HashMap<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key))
            return -1;

        Node node = cache.get(key);
        // move node to the head of linked list.
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.get(key).value = value;
            moveToHead(cache.get(key));
        } else {
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                Node tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        }
    }

    private void addToHead(Node node) {
        node.previous = head;
        node.next = head.next;
        head.next.previous = node;
        head.next = node;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    private Node removeTail(){
        Node res = tail.previous;
        removeNode(res);
        return res;
    }

    class Node {
        private int key;
        private int value;
        private Node previous;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node() {

        }
    }
}
