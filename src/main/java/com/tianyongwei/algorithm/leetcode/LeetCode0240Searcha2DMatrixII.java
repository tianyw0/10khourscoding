package com.tianyongwei.algorithm.leetcode;

public class LeetCode0240Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        int xlen = matrix.length;
        int ylen = matrix[0].length;

        // 从左下角开始找，直到超出边界
        int xloc = xlen-1, yloc = 0;
        while(isOK(xloc, xlen) && isOK(yloc, ylen)) {
            if(matrix[xloc][yloc] == target) {
                return true;
            } else if(matrix[xloc][yloc] > target) {
                // 开始找matrix[xloc-1][yloc]
                xloc--;
            } else if(matrix[xloc][yloc] < target) {
                // 开始找matrix[xloc][yloc+1]
                yloc++;
            }
        }
        return false;
    }

    private boolean isOK(int loc, int len) {
        return loc >= 0 && loc <= len-1;
    }
}
