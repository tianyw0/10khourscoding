package com.tianyongwei.algorithm.misc;

import com.tianyongwei.algorithm.hashfilter.FindMinMax;
import com.tianyongwei.algorithm.hashfilter.MinMax;
import org.junit.jupiter.api.Test;

class FindMinMaxTest {

    @Test
    void getMinMax() {
        assertEquals(new MinMax(1,6), new FindMinMax().getMinMax(new int[]{1,2,3,4,5,6}));
    }

    @Test
    void getMinMax2() {
        assertEquals(new MinMax(1,2), new FindMinMax().getMinMax(new int[]{1,2}));
    }

    @Test
    void getMinMax3() {
        assertEquals(new MinMax(1,6), new FindMinMax().getMinMax(new int[]{1,6,6}));
    }

    @Test
    void getMinMax4() {
        assertEquals(new MinMax(1,1), new FindMinMax().getMinMax(new int[]{1,1,1,1,1,1}));
    }

    @Test
    void getMinMax5() {
        assertEquals(new MinMax(-1,6), new FindMinMax().getMinMax(new int[]{-1,2,3,4,5,6}));
    }

    @Test
    void getMinMax6() {
        assertEquals(new MinMax(-1,-1), new FindMinMax().getMinMax(new int[]{-1,-1}));
    }

    @Test
    void getMinMax7() {
        assertEquals(new MinMax(-1,-1), new FindMinMax().getMinMax(new int[]{-1}));
    }
}