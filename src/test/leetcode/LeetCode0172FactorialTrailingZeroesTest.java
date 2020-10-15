package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0172FactorialTrailingZeroesTest {

    @Test
    void trailingZeroes() {
        assertEquals(0, new LeetCode0172FactorialTrailingZeroes().trailingZeroes(3));
    }

    @Test
    void trailingZeroes2() {
        assertEquals(0, new LeetCode0172FactorialTrailingZeroes().trailingZeroes(0));
    }

    @Test
    void trailingZeroes3() {
        assertEquals(1, new LeetCode0172FactorialTrailingZeroes().trailingZeroes(5));
    }

    @Test
    void trailingZeroes4() {
        assertEquals(2, new LeetCode0172FactorialTrailingZeroes().trailingZeroes(10));
    }

    @Test
    void trailingZeroes5() {
        assertEquals(3, new LeetCode0172FactorialTrailingZeroes().trailingZeroes(15));
    }

    @Test
    void trailingZeroes6() {
        assertEquals(7, new LeetCode0172FactorialTrailingZeroes().trailingZeroes(30));
    }

    @Test
    void trailingZeroes7() {
        assertEquals(9, new LeetCode0172FactorialTrailingZeroes().trailingZeroes(40));
    }
}