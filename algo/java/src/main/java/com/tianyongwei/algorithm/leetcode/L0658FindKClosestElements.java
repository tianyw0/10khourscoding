package com.tianyongwei.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L0658FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr[0] >= x) {
            return new ArrayList<Integer>(){{
                for (int i = 0; i < k; i++) {
                    add(arr[i]);
                }
            }};
        }

        if(arr[arr.length-1] <= x) {
            return new ArrayList<Integer>(){{
                for (int i = arr.length - k; i < arr.length; i++) {
                    add(arr[i]);
                }
            }};
        }

        int index = getCloestIndex(arr, x);

        int currLow = index;
        int currHigh = index;
        for (int i = 0; i < k-1; i++) {
            if(currHigh >= arr.length-1) {
                currLow--;
            }
            else if(currLow <= 0) {
                currHigh++;
            }
            else {
                if (Math.abs(arr[currHigh + 1] - x) < Math.abs(arr[currLow - 1] - x)) {
                    currHigh++;
                } else {
                    currLow--;
                }
            }
        }
        final ArrayList<Integer> list = new ArrayList<>();
        for (int i = currLow; i <= currHigh; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    private int getCloestIndex(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        int index = -1;
        int minabs = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int myabs = Math.abs(arr[mid] - x);
            if(myabs >= minabs) {
                if(x > arr[mid]) {
                    lo = mid + 1;
                }
                else if(x <= arr[mid]) {
                    hi = mid - 1;
                }
            }
            else if(myabs < minabs){
                index = mid;
                minabs = myabs;
                if(x >= arr[mid]) {
                    lo = mid + 1;
                }

                else if(x < arr[mid]) {
                    hi = mid - 1;
                }
            }
        }
        return index;
    }
}
