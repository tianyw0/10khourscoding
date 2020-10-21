package com.tianyongwei.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0887SuperEggDrop1 {

    Map<String, Integer> map = new HashMap<>();
    public int superEggDrop(int K, int N) {
        // 直接计算需要落下去几次鸡蛋？
        return dp(K, N);
    }
    // 暴力算法，计算所有情况的次数，比较得到最优解（超时）
    private int dp(int eggs, int floors) {
        String mapKey = eggs+ "," +floors;
        if(map.containsKey(mapKey)) {
            return map.get(mapKey);
        }
        // 初始化次数
        int times = 0;

        // 当只有一个鸡蛋的时候，直接推理就能得到结果，只能从下往上
        // 每层都落鸡蛋试一下，因为最坏的情况是F是最顶层
        if(eggs == 1) {
            times = floors;
            return returnTimes(mapKey, times);
        }
        // 当只有一层楼的时候，直接推理就能知道不需要落鸡蛋
        if(floors == 0) {
            times = 0;
            return returnTimes(mapKey, times);
        }
        // 当楼层高度至少是两层的时候，先扔第一次，
        // 然后此时会有floors种情况
        // floors中情况中的最大值
        times++;// 先扔一次看看
        int minTimes = Integer.MAX_VALUE;
        for (int i = 1; i <= floors; i++) {
            int q0 = dp(eggs, floors-i);// egg is fine
            int q1 = dp(eggs-1, i-1);// egg is broken
            int maxTimes = Math.max(q0, q1);
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
