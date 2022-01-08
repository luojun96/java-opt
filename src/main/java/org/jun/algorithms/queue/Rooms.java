package org.jun.algorithms.queue;

import java.util.*;

public class Rooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.offer(0);
        set.add(0);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int roomIndex = queue.poll();
                if (set.size() == rooms.size()) return true;
                List<Integer> keys = rooms.get(roomIndex);
                for (int key : keys){
                    if (!set.contains(key)){
                        queue.offer(key);
                        set.add(key);
                    }
                }
            }
        }
        return false;
    }
}
