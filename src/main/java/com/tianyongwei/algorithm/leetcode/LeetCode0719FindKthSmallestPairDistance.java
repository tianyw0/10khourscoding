package com.tianyongwei.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeetCode0719FindKthSmallestPairDistance {
    public int smallestDistancePair(int[] nums, int k) {
        // 2	3	4	5	6
        //	    1	2	3	4
        //		    1	2	3
        //		    	1	2
        //		    		1
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                list.add(Math.abs(nums[i]-nums[j]));
            }
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        return list.get(k-1);
    }
}
