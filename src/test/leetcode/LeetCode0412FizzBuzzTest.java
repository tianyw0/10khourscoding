package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0412FizzBuzzTest {

    @Test
    void fizzBuzz() {
        assertEquals(new ArrayList<String>(){{
            add("1");
            add("2");
            add("Fizz");
        }}, new LeetCode0412FizzBuzz().fizzBuzz(3));
    }

    @Test
    void fizzBuzz2() {
        assertEquals(new ArrayList<String>(){{
            add("1");
            add("2");
            add("Fizz");
            add("4");
            add("Buzz");
            add("Fizz");
            add("7");
        }}, new LeetCode0412FizzBuzz().fizzBuzz(7));
    }
}