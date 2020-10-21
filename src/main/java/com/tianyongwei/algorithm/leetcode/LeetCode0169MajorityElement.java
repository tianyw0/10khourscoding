package com.tianyongwei.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0169MajorityElement {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.getOrDefault(num, 0)+1;
            if(count > nums.length/2)
                return num;
            map.put(num, count);
        }
        // 除非输入数据出错，否则不可能走到这里
        return -1;
    }
}
