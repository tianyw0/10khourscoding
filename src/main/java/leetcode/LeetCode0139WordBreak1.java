package leetcode;

import java.util.*;

public class LeetCode0139WordBreak1 {
    List<LinkedList<String>> res = new ArrayList<LinkedList<String>>();
    Set<String> wordSet = new HashSet<>();

    // 刚学会回溯，但使用回溯的话是超时的，见测试6。
    // 其实，不要返回结果的情况是不用使用回溯的，复杂度高。
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.size() == 0) return false;

        // 初始化
        wordDict.forEach(w -> {
            wordSet.add(w);
        });

        backTrace(s, 0, new LinkedList<String>());

        if(res.size() == 0) return false;
        for (LinkedList<String> resList : res) {
            if (!wordDict.containsAll(resList)) {
                return false;
            }
        }
        return true;
    }

    private void backTrace(String s, int i, LinkedList<String> trace) {
        if(i >= s.length()) {
            res.add(new LinkedList<>(trace));
            return;
        }

        int stepLen = s.length() - i;
        for (int j = 0; j < stepLen; j++) {
            String target = s.substring(i, i+j+1);
            if(!judge(target)) {
                continue;
            }
            trace.add(target);
            backTrace(s, i+j+1, trace);
            trace.removeLast();
        }
    }

    private boolean judge(String target) {
        return wordSet.contains(target);
    }
}
