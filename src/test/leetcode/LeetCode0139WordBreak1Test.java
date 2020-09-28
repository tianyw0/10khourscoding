package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0139WordBreak1Test {
    LeetCode0139WordBreak1 wordBreak
            = new LeetCode0139WordBreak1();

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

    @Test
    void wordBreak5() {
        assertEquals(true, wordBreak.wordBreak("bb", new ArrayList<String>(){{
            add("a");
            add("b");
            add("bbb");
            add("bbbb");
        }}));
    }
    @Test
    void wordBreak6() {
        assertEquals(true, wordBreak.wordBreak("acaaaaabbbdbcccdcdaadcdccacbcccabbbbcdaaaaaadb"
                , Arrays.asList(new String[]{"abbcbda","cbdaaa","b","dadaaad","dccbbbc"
                        ,"dccadd","ccbdbc","bbca","bacbcdd","a","bacb","cbc","adc","c"
                        ,"cbdbcad","cdbab","db","abbcdbd","bcb","bbdab","aa","bcadb","bacbcb"
                        ,"ca","dbdabdb","ccd","acbb","bdc","acbccd","d","cccdcda","dcbd","cbccacd"
                        ,"ac","cca","aaddc","dccac","ccdc","bbbbcda","ba","adbcadb","dca","abd"
                        ,"bdbb","ddadbad","badb","ab","aaaaa","acba","abbb"})));
    }

}