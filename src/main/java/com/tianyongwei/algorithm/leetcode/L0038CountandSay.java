package com.tianyongwei.algorithm.leetcode;

public class L0038CountandSay {
    public String countAndSay(int n) {
        if(n == 1) return "1";

        String curr = "1";
        for (int i = 2; i < n; i++) {
            curr = say(curr);
        }
        return say(curr);
    }

    private String say(String curr) {
        String res = "";
        char ch = curr.charAt(0);
        int chCount = 1;
        for (int i = 1; i < curr.length(); i++) {
            if(ch == curr.charAt(i)) {
                chCount++;
            } else {
                res += (chCount+""+ch);
                ch = curr.charAt(i);
                chCount = 1;
            }
        }
        res += (chCount+""+ch);
        return res;
    }
}
