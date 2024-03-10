package com.tianyongwei.algorithm.leetcode;

import java.util.LinkedList;
import java.util.List;

public class L0131PalindromePartitioning {

    List<List<String>> res = new LinkedList<List<String>>();
    public List<List<String>> partition(String s) {
        backTrace(s, 0, new LinkedList<String>());
        res.forEach(l -> {
            System.out.println(l);
        });
        return res;
    }

    // i 就是第一刀的位置
    private void backTrace(String s, int i, LinkedList<String> trace) {
        if(i >= s.length()) {
            res.add(new LinkedList<>(trace));
            return;
        }

        // 第一刀的位置有 s.length 种可能，遍历第一刀的位置
        // j 就是步长，步长在逐渐增加
        for (int j = 0; j < s.length() - i; j++) {
            String target = s.substring(i, i+j+1);
            if(!judge(target)) {
                continue;
            }
            trace.add(target);
            backTrace(s, i+j+1, trace);
            trace.removeLast();
        }
    }

    public boolean judge(String target) {
        if(target.length() == 0) return false;
        int lo = 0, hi = target.length()-1;
        while (lo <= hi) {
            if(target.charAt(lo) != target.charAt(hi)) {
                return false;
            }
            lo++;hi--;
        }
        return true;
    }
}
