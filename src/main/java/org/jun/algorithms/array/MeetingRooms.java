package org.jun.algorithms.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {
    public int getMinMeetingRooms(int[][] intervals){
        // corner cases
        if(intervals == null || intervals.length == 0) return 0;

        // sort meetings by start time
        Arrays.sort(intervals, (int[] a, int[] b) -> (a[0] - b[0]));
        // create priority queue based on end time
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((int[] a, int[] b) -> (a[1] - b[1]));
        pq.offer(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= pq.peek()[1]) pq.poll();
            pq.offer(intervals[i]);
        }

        return pq.size();
    }
}