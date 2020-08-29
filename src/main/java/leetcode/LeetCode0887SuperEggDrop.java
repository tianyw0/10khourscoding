package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0887SuperEggDrop {

    Map<String, Integer> map = new HashMap<>();

//    public int superEggDrop(int K, int N) {
//        // 直接计算需要落下去几次鸡蛋？
//        return dropTimes_force(K, N);
//    }

    public int superEggDrop_p(int K, int N) {
        // 直接计算需要落下去几次鸡蛋？
        return dropTimes_pruning(K, N);
    }

//    // 暴力算法，计算所有情况的次数，比较得到最优解
//    private int dropTimes_force(int eggs, int floors) {
//        String mapKey = eggs+ "," +floors;
//        if(map.containsKey(mapKey)) {
//            return map.get(mapKey);
//        }
//        // 初始化次数
//        int times = 0;
//
//        // 当只有一个鸡蛋的时候，直接推理就能得到结果，只能从下往上
//        // 每层都落鸡蛋试一下，因为最坏的情况是F是最顶层
//        if(eggs == 1) {
//            times = floors;
//            return returnTimes(mapKey, times);
//        }
//        // 当只有一层楼的时候，直接推理就能知道不需要落鸡蛋
//        if(floors == 0) {
//            times = 0;
//            return returnTimes(mapKey, times);
//        }
//        // 当楼层高度至少是两层的时候，先扔第一次，
//        // 然后此时会有floors种情况
//        // floors中情况中的最大值
//        times++;// 先扔一次看看
//        int minTimes = Integer.MAX_VALUE;
//        for (int i = 1; i <= floors; i++) {
//            int q0 = dropTimes_force(eggs, floors-i);// egg is fine
//            int q1 = dropTimes_force(eggs-1, i-1);// egg is broken
//            int maxTimes = Math.max(q0, q1);
//            minTimes = Math.min(minTimes, maxTimes);
//        };
//        times += minTimes;
//        return returnTimes(mapKey, times);
//    }

    // 剪枝，直接向最快的方向前进
    private int dropTimes_pruning (int eggs, int floors) {
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
            int fineTimes = dropTimes_pruning(eggs, floors-mid);// egg is fine
            int brokenTimes = dropTimes_pruning(eggs-1, mid-1);// egg is broken
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
