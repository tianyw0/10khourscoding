package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0557ReverseWordsinaStringIIITest {

    @Test
    void reverseWords() {
        assertEquals("I EVOL U", new LeetCode0557ReverseWordsinaStringIII().reverseWords("I LOVE U"));
    }

    @Test
    void reverseWords2() {
        assertEquals("U", new LeetCode0557ReverseWordsinaStringIII().reverseWords("U"));
    }
}