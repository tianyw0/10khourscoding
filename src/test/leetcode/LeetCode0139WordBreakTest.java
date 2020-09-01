package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0139WordBreakTest {
    LeetCode0139WordBreak wordBreak
            = new LeetCode0139WordBreak();

    @Test
    void wordBreak1() {
        assertEquals(true, wordBreak.wordBreak("leetcode", new ArrayList<String>(){{
            add("leet");
            add("code");
        }}));
    }

    @Test
    void wordBreak2() {
        assertEquals(true, wordBreak.wordBreak("applepenapple", new ArrayList<String>(){{
            add("apple");
            add("pen");
        }}));
    }

    @Test
    void wordBreak3() {
        assertEquals(false, wordBreak.wordBreak("catsandog", new ArrayList<String>(){{
            add("cats");
            add("dog");
            add("sand");
            add("and");
            add("cat");
        }}));
    }

    @Test
    void wordBreak4() {
        assertEquals(false, wordBreak.wordBreak("a", new ArrayList<String>(){}));
    }
}