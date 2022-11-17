package com.tianyongwei.algorithm.leetcode;

public class L0744FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {

        if(letters[letters.length-1] <= target) {
            return letters[0];
        }

        else if(target < letters[0]) {
            return letters[0];
        }

        else if(letters[0] <= target && target < letters[letters.length-1]) {
            int index = -1;
            int lo = 0, hi = letters.length - 1;
            while (lo <= hi) {

                int mid = lo + ((hi - lo) >> 1);
                if(letters[mid] > target) {
                    index = mid;
                    hi = mid - 1;
                }
                else if(letters[mid] <= target) {
                    lo = mid + 1;
                }
            }

            if(index == -1) {
                return letters[0];
            } else {
                return letters[index];
            }
        }

        return '0';
    }
}
