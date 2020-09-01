package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0046Permutations {
    List<List<Integer>> res = new LinkedList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        backTrace(nums, new LinkedList<Integer>());
//        for (List<Integer> re : res) {
//            System.out.println(re);
//        }
        return res;
    }

    // 回溯思想（本身包含了递归思想在里面），不断的试探，
    private void backTrace(int[] nums, LinkedList<Integer> trace) {

        // 走，并记录下路径，达到底部的路径
        // 全排列的概念是：三个元素的情况是，有三个空位，一共有 3 * 2 * 1 中情况。

        if(trace.size() == nums.length) {
            res.add(new LinkedList<>(trace));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if(trace.contains(nums[j])) {
                continue;// 重复元素直接过
            }
            trace.add(nums[j]);
            // 递归就是相信这个函数能完成任务：完成并存储当前情况下的全排列
            backTrace(nums, trace);
            trace.removeLast();
        }
    }
}
