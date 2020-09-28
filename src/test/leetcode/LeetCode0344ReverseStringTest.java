package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LeetCode0344ReverseStringTest {

    LeetCode0344ReverseString reverseString
            = new LeetCode0344ReverseString();

    @Test
    void reverseString() {
        char[] chars = {'a', 'b', 'c'};
        reverseString.reverseString(chars);
        assertArrayEquals(new char[]{'c','b','a'}, chars);
    }
}