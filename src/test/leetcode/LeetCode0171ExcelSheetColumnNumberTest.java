package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0171ExcelSheetColumnNumberTest {

    @Test
    void titleToNumber() {
        assertEquals(28, new LeetCode0171ExcelSheetColumnNumber().titleToNumber("AB"));
    }

    @Test
    void titleToNumber1() {
        assertEquals(1, new LeetCode0171ExcelSheetColumnNumber().titleToNumber("A"));
    }

    @Test
    void titleToNumber2() {
        assertEquals(2, new LeetCode0171ExcelSheetColumnNumber().titleToNumber("B"));
    }
}