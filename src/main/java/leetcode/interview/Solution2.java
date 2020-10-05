package leetcode.interview;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public boolean isMonotonic(int[] A) {

        if(A.length == 1) return true;

        int trend = 0;
        for (int i = 1; i < A.length; i++) {
            int curr_trend = 0;
            if(A[i] > A[i-1]) curr_trend = 1;
            else if(A[i] < A[i-1]) curr_trend = -1;

            if(trend == 0) {
                trend = curr_trend;
            } else {
                if(curr_trend != 0 && trend != curr_trend) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.add(1);
        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
