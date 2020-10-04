package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0658FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr[0] >= x) {
            return new ArrayList<Integer>(){{
                for (int i = 0; i < k; i++) {
                    add(arr[i]);
                }
            }};
        }

        if(arr[0] <= x) {
            return new ArrayList<Integer>(){{
                for (int i = arr.length-1; i > arr.length - 1 - k; i--) {
                    add(arr[i]);
                }
            }};
        }

        int lo = 0, hi = arr.length - 1;
        int index = -1;
        int minabs = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int myabs = Math.abs(arr[mid] - x);
            if(myabs > minabs) {
                hi = mid - 1;
            }
            else if(myabs <= minabs){

            }
        }



        return null;
    }
}
