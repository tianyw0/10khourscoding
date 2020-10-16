package leetcode;

import java.util.Stack;

public class LeetCode0155MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min;

    public LeetCode0155MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x < min) {
            min = x;
        }
        minStack.add(min);
        stack.add(x);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

