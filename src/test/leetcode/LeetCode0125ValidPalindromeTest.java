package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0125ValidPalindromeTest {

    LeetCode0125ValidPalindrome validPalindrome
            = new LeetCode0125ValidPalindrome();
    @Test
    void isPalindrome() {
        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(true, validPalindrome.isPalindrome(""));
        assertEquals(true, validPalindrome.isPalindrome("1"));
        assertEquals(true, validPalindrome.isPalindrome("121"));
        assertEquals(false, validPalindrome.isPalindrome("1212"));
    }
}