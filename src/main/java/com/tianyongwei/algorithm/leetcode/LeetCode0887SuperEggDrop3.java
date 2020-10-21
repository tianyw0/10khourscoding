package com.tianyongwei.algorithm.leetcode;

import java.util.Arrays;

public class LeetCode0887SuperEggDrop3 {

    // 填表
    int[][] dict;
    public int superEggDrop(int K, int N) {
        dict = new int[K+1][N+1];
        return dp(K, N);
    }

    // 自底向上 推导出字典(填表)，这里已经从递归中跳出来了
    private int dp(int eggs, int floors) {
        // 边界情况直接返回结果
        if(eggs == 0 || floors == 0) {
            return 0;
        }
        if(eggs == 1) {
            return floors;
        }
        if(floors == 1) {
            return 1;
        }

        // 非边界情况，需要做初始化工作，自底向上
        for (int i = 0; i <= floors; i++) {
            dict[1][i] = i;// 只有一个鸡蛋
        }
        for (int i = 0; i <= floors; i++) {
            dict[0][i] = 0;// 没有鸡蛋
        }
        for (int i = 0; i <= eggs; i++) {
            dict[i][1] = 1;// 只有一层楼
        }
        for (int i = 0; i <= eggs; i++) {
            dict[i][0] = 0;// 没有楼层
        }
        // 其它情况自底向上，完善字典
        int count= 0;
        for (int egg = 2; egg <= eggs; egg++) {
            for (int floor = 2; floor <= floors; floor++) {
                // 填表 dict[egg][floor], 找到最小次数
                System.out.println("\n开始计算dict["+egg+"]["+floor+"]");
                int minTimes = Integer.MAX_VALUE;
                for (int k = 1; k <= floor ; k++) {
                    count++;
                    int times = 1;
                    int fineTimes = dict[egg][k-1];
                    int brokenTimes = dict[egg-1][floor-k];
                    times += Math.max(fineTimes, brokenTimes);
                    System.out.println("开始计算dict["+egg+"]["+floor+"]==>[k="+k+"]");
                    System.out.println("开始计算dict["+egg+"]["+floor+"]==>[k="+k+"]:["+egg+"]["+(k-1)+"]="+fineTimes);
                    System.out.println("开始计算dict["+egg+"]["+floor+"]==>[k="+k+"]:["+(egg-1)+"]["+(floor-k)+"]="+brokenTimes);
                    System.out.println("开始计算dict["+egg+"]["+floor+"]==>[k="+k+"]==>当前Math.max(fineTimes, brokenTimes)+1:"+times);
                    minTimes = Math.min(minTimes, times);
                    System.out.println("开始计算dict["+egg+"]["+floor+"]==>[k="+k+"]==>当前minTimes:"+minTimes);
                }
                dict[egg][floor] = minTimes;
                printdict(dict, eggs, floors);
            }
        }
        System.out.println(count++);
        return dict[eggs][floors];
    }

    private void printdict(int[][] dict, int eggs, int floors) {
        for (int i = 0; i <= eggs ; i++) {
            System.out.println(Arrays.toString(dict[i]));
        }
    }

}
