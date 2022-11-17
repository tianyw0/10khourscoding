package com.tianyongwei.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class L0412FizzBuzz {
    public List<String> fizzBuzz(int n) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(){{
            put(3, "Fizz");
            put(5, "Buzz");
        }};

        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tmp = "";
            for (Integer key : map.keySet()) {
                if(i % key == 0) {
                    tmp += map.get(key);
                }
            }
            res.add(tmp.equalsIgnoreCase("") ? String.valueOf(i) : tmp);
        }

        return res;
    }
}
