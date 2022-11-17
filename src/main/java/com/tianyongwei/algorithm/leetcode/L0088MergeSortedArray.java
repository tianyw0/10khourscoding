package com.tianyongwei.algorithm.leetcode;

import java.util.Arrays;

public class L0088MergeSortedArray {

    // 双指针从前往后
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < n ; i++) {
            System.out.println(Arrays.toString(nums1));
            for (; j < nums1.length; j++) {
                int currNum2 = nums2[i];
                int currNum1 = nums1[j];
                if(currNum2 <= currNum1) {
                    //插入并挪动其他元素
                    //nums1长度+1
                    //记录当前位置并跳出nums2循环
                    move(nums1, m, j, currNum2);
                    m++;
                    break;
                } else {
                    //在长度范围外直接复制剩余元素
                    if(j >= m) {
                        copy(nums1, j, nums2, i);
                        return;
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private void copy(int[] nums1, int j, int[] nums2, int i) {
        for (int k = i; k < nums2.length; k++) {
            nums1[j++] = nums2[k];
        }
    }

    private void move(int[] nums1, int m, int j, int currNum2) {
        for (int i = m; i >= j+1; i--) {
            nums1[i] = nums1[i-1];
        }
        nums1[j] = currNum2;
    }

    // 双指针从后往前
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int lastLocation = nums1.length - 1;
        for (int i = n-1; i >= 0; i--) {
            int currNum2 = nums2[i];
            int j = m-1;
            for (; j >= 0; j--) {
                int currNum1 = nums1[j];
                if(currNum1 <= currNum2) {
                    nums1[lastLocation] = currNum2;
                    lastLocation --;
                    break;
                } else {
                    nums1[lastLocation] = currNum1;
                    lastLocation --;
                    m--;
                }
            }

            if(j < 0) {
                // 转移全部
                for (int k = 0; k < i+1; k++) {
                    nums1[k] = nums2[k];
                }
            }
        }
    }
}
