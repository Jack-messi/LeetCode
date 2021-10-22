package com.剑指offer陪跑营.a1栈和队列;

import java.util.Stack;

public class a1剑指Offer30包含min函数的栈 {
}

class MinStack {

    /**
     * initialize your data structure here.
     */
    Stack<Integer> stack, minStack;
    int minValue = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {

        if (minStack.isEmpty() || minStack.peek()>x)
        {
            minStack.push(x);
        }else {
            minStack.push(minStack.peek());
        }
        stack.push(x);

//        stack.push(x);
//        if (x < minValue) {
//            minValue = x;
//        }
//        minStack.push(minValue);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
