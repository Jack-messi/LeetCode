package com.程序员面试金典;

import java.util.Deque;
import java.util.Stack;

public class 面试题0302栈的最小值 {
}

/*
思路：

根据题意，我们需要在常量级的时间内找到最小值！
这说明，我们绝不能在需要最小值的时候，再做排序，查找等操作来获取！
1、用两个栈来存储
2、一个栈stack存储常规数据，一个栈minstack存储当前的最小值，初始化的时候，minstack要存储一个Integer.MAX_VALUE最大值。


 */

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */