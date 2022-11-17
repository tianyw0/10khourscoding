package com.tianyongwei.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L0887SuperEggDrop2 {

    Map<String, Integer> map = new HashMap<>();
    public int superEggDrop(int K, int N) {
        // 直接计算需要落下去几次鸡蛋？
        return dp(K, N);
    }

    // 利用二分法剪枝，直接向最快的方向前进（超时）
    private int dp(int eggs, int floors) {
        String mapKey = eggs+ "," +floors;
        System.out.println(mapKey);
        if(map.containsKey(mapKey)) {
            return map.get(mapKey);
        }
        int times = 0;

        if(eggs == 1) {
            times = floors;
            return returnTimes(mapKey, times);
        }
        if(floors == 1) {
            times = 1;
            return returnTimes(mapKey, times);
        }
        if(floors == 0) {
            times = 0;
            return returnTimes(mapKey, times);
        }

        times++;
        int minTimes = Integer.MAX_VALUE;
        // 剪枝（二分法）
        int lo = 1, hi = floors;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int fineTimes = dp(eggs, floors-mid);// egg is fine
            int brokenTimes = dp(eggs-1, mid-1);// egg is broken
            if(fineTimes > brokenTimes) { //
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
            int maxTimes = Math.max(fineTimes, brokenTimes);
            minTimes = Math.min(minTimes, maxTimes);
        };
        times += minTimes;
        return returnTimes(mapKey, times);
    }
    private int returnTimes(String mapKey, int times) {
        map.put(mapKey, times);
        return times;
    }
}
