package leetcode;

public class LeetCode0088MergeSortedArray {

    // 双指针从前往后
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = p; j < nums1.length; j++) {
                int currNum2 = nums2[i];
                int currNum1 = nums1[j];
                if(currNum2 <= currNum1) {
                    //todo 插入并挪动其他元素
                    //nums1长度+1
                    //记录当前位置并跳出nums2循环
                    move(nums1, m, j, currNum2);
                    m++;
                    p = j;
                    break;
                } else {
                    //在长度范围外直接复制剩余元素
                    if(j >= m) {
                        // todo
                        return;
                    } else {
                        continue;
                    }
                }
            }
        }

    }

    private void move(int[] nums1, int m, int j, int currNum2) {
        for (int i = m-1; i >= j; i--) {
            nums1[i] = nums1[i-1];
        }
        nums1[j] = currNum2;
    }

    // 双指针从后往前
    public void merge2(int[] nums1, int m, int[] nums2, int n) {


    }
}
