package com.tianyongwei.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();

        if(numRows == 1) {
            res.add(new ArrayList<Integer>(){{add(1);}});
            return res;
        }

        List<Integer> curr = new ArrayList<Integer>(){{add(1);}};
        res.add(new ArrayList<Integer>(){{add(1);}});
        for (int i = 2; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    list.add(curr.get(j)+curr.get(j-1));
                }
            }
            res.add(list);
            curr = list;
        }
        return res;
    }
}
