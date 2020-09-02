package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0189RotateArray {
    public void rotate(int[] nums, int k) {
        if(k % nums.length == 0) {
            return;
        }
        k = k % nums.length;
        Queue<Integer> queue =  new LinkedList<>();
        int loc = nums.length - k;
        // 执行num.length次入队的操作
        for (int i = 0; i < nums.length; i++) {
            if(loc >= nums.length) {
                loc %= nums.length;
            }
            queue.offer(nums[loc]);
            loc++;
        }

        // 出队填充
        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.poll();
        }
        // System.out.println(Arrays.toString(nums));
    }
}
