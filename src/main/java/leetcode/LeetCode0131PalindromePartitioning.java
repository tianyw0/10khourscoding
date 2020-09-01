package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0131PalindromePartitioning {

    List<List<Integer>> res = new LinkedList<>();
    public List<List<String>> partition(String s) {
        // 找到所有的切割方案，然后排除不满足条件的方案
        // 一共有2^(s.length-1)中切割情况

        // 先想办法输出这些情况，再想办法删除不合适的情况
        // abc 情况下，按照一下顺序打印
        // 一个字母开头，a,b,c/a,bc[11,10]
        // 两个字母开头，ab,c[01]
        // 三个字母开头，abc[00]
        // todo 131
        backTrace(s, new LinkedList<Character>());
        return res;
    }

    private void backTrace(String s, LinkedList<Character> characters) {


    }
}
