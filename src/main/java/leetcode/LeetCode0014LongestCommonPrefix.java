package leetcode;

public class LeetCode0014LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String commonStr = "";
        int idx = 0;
        char currChar = '\0';
        while(true) {
            // 确认每个字符串的第idx个都一样
            for (int i = 0; i < strs.length; i++) {
                String currStr = strs[i];
                if(currStr.length() <= idx) {
                    return commonStr;
                }
                if(i == 0) {
                    currChar = currStr.charAt(idx);
                    continue;
                } else {
                    if(Character.compare(currChar, currStr.charAt(idx)) != 0) {
                        return commonStr;
                    }
                }
            }
            commonStr += String.valueOf(currChar);
            idx++;
        }
    }
}

