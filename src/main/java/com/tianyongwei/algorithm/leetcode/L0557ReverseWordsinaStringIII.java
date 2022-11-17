package com.tianyongwei.algorithm.leetcode;


public class L0557ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                res.append(getReverseWord(word));
                word = new StringBuilder();
                res.append(c);
            } else {
                word.append(c);
            }
        }
        res.append(getReverseWord(word));
        return res.toString();
    }

    private String getReverseWord(StringBuilder word) {
        String wordStr = word.toString();
        StringBuilder sb = new StringBuilder();
        for (int i = wordStr.length() - 1; i >= 0; i--) {
            sb.append(wordStr.charAt(i));
        }
        return sb.toString();
    }
}
