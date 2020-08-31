package leetcode;

public class LeetCode0240Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        if(matrix.length == 0) {
            return false;
        }
        int xlen = matrix[0].length;
        int ylen = matrix.length;

        int xloc = 0, yloc = ylen - 1;
        while(isOK(xloc, xlen) && isOK(yloc, ylen)) {
            if(matrix[xloc][yloc] == target) {
                return true;
            } else if(matrix[xloc][yloc] > target) {
                // 开始找matrix[xloc][yloc+1]
                yloc++;
            } else if(matrix[xloc][yloc] < target) {
                // 开始找matrix[xloc-1][yloc]
                xloc--;
            }
        }
        return false;
    }

    private boolean isOK(int loc, int len) {
        return loc >= 0 && loc <= len-1;
    }
}
