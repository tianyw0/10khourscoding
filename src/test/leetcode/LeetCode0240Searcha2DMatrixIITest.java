package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0240Searcha2DMatrixIITest {

    LeetCode0240Searcha2DMatrixII searcha2DMatrixII
            = new LeetCode0240Searcha2DMatrixII();

    @Test
    void searchMatrix() {
        assertEquals(true, searcha2DMatrixII.searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19}, {3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},5));
    }
}