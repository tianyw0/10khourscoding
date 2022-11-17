package com.tianyongwei.algorithm.leetcode;

import java.util.Arrays;

public class L0887SuperEggDrop4 {
    // todo 87
    // 填表
    int[][] dict;

    public int superEggDrop(int K, int N) {
        dict = new int[K + 1][N + 1];
        return dp(K, N);
    }

    // 自底向上 推导出字典(填表)，这里已经从递归中跳出来了
    private int dp(int eggs, int floors) {
        // 边界情况直接返回结果
        if (eggs == 0 || floors == 0) {
            return 0;
        }
        if (eggs == 1) {
            return floors;
        }
        if (floors == 1) {
            return 1;
        }

        // 非边界情况，需要做初始化工作，自底向上
        for (int i = 0; i <= floors; i++) {
            dict[1][i] = i;// 只有一个鸡蛋
        }
        for (int i = 0; i <= eggs; i++) {
            dict[i][1] = 1;// 只有一层楼
        }
        for (int i = 0; i <= floors; i++) {
            dict[0][i] = 0;// 没有鸡蛋
        }
        for (int i = 0; i <= eggs; i++) {
            dict[i][0] = 0;// 没有楼层
        }
        // 其它情况自底向上，完善字典
        for (int egg = 2; egg <= eggs; egg++) {
            for (int floor = 2; floor <= floors; floor++) {
                // 填表 dict[egg][floor], 找到最小次数
                // 问题的关键是：我可以从1到floor层中的任何一层开始扔，所以有floor的情况，
                // 那么问题来了，最直接的方法是统计所有这些情况，找到最小值
                // 可以确认的一点是：floor中情况的最小值都可以直接得到：1 + Math.max(fineTimes, brokenTimes)
                // 所以有没有好一点的方法直接找到这个最小值。
                // 可以想到的是1到floor情况中，随着层数的增加，所需要落鸡蛋的次数是增加的，也就是单调递增的。
                // System.out.println("\n开始计算dict["+egg+"]["+floor+"]");
                int minTimes = Integer.MAX_VALUE;

                int lo = 1, hi = floor;
                while (lo < hi) {
                    int mid = lo + (hi - lo) / 2;
                    // 从中间开始扔鸡蛋
                    int fineTimes = dict[egg][floor - mid];
                    int brokenTimes = dict[egg - 1][mid - 1];
                    int times = 1 + Math.max(fineTimes, brokenTimes);
                    minTimes = Math.min(minTimes, times);
                    if (fineTimes >= brokenTimes) {
                        // max评比中fineTimes胜出，向上走
                        lo = mid + 1;
                    } else {
                        // max评比中brokenTimes胜出，向下走
                        hi = mid - 1;
                    }
                }
                dict[egg][floor] = minTimes;
                // printdict(dict, eggs, floors);
            }
        }
        // printdict(dict, eggs, floors);
        return dict[eggs][floors];
    }

    private void printdict(int[][] dict, int eggs, int floors) {
        for (int i = 0; i <= eggs; i++) {
            System.out.println(Arrays.toString(dict[i]));
        }
    }
}
