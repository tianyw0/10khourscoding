package leetcode;

import java.util.*;

public class LeetCode0719FindKthSmallestPairDistance2 {
    // 将差值当成索引下标
    // count[1] = 10; 距离为1的数对有十个。
    public int smallestDistancePair(int[] nums, int k) {
        int[] count = new int[1000000];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int abs = Math.abs(nums[i] - nums[j]);
                count[abs]++;
            }
        }
        int step = 0;
        for (int distance = 0; distance < count.length; distance++) {
            if(step >= k) {
                return distance - 1;
            } else {
                step += count[distance];
            }
        }

        return 0;
    }
}
