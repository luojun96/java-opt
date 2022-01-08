package org.jun.algorithms.queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClonedGraph {

    public Node cloneGraph(Node node){
        return clone(node, new HashMap<Integer, Node>());
    }

    private Node clone(Node node, HashMap<Integer, Node> visited){
        if (node == null) {
            return null;
        }

        if (visited.containsKey(node.val)){
            return visited.get(node.val);
        }

        Node newNode = new Node(node.val, new ArrayList<>());
        visited.put(newNode.val, newNode);

        for (Node neighbor : node.neighbors){
            newNode.neighbors.add(clone(neighbor, visited));
        }
        return newNode;
    }

    public static class Node{
        public int val;
        public List<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }
        public Node(int val, List<Node> neighbors){
            this.val = 0;
            this.neighbors = neighbors;
        }
    }
}
