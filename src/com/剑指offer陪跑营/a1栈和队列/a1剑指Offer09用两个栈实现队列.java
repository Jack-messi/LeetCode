package com.剑指offer陪跑营.a1栈和队列;

import java.util.Stack;

public class a1剑指Offer09用两个栈实现队列 {
    public static void main(String[] args) {

    }
}

class CQueue {
    Stack<Integer> stack1, stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
