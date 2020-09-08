package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0283MoveZeroes {
    public void moveZeroes(int[] nums) {

        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            if (num != 0) {
                queue.offer(num);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            Integer poll = queue.poll();
            if(poll != null)
                nums[i] = poll;
            else
                nums[i] = 0;
        }

        // System.out.println(Arrays.toString(nums));
    }
}
