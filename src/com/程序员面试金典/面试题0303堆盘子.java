package com.程序员面试金典;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 面试题0303堆盘子 {
}
/*
思路

新建一个List<Stack<Integer>>用来存放各个栈，而且栈的个数是动态变化的。
push的时候，可能需要新建一个栈，或者直接插入到最后一个栈中。
pop直接调用popAt方法。其中popAt方法需要处理的是弹出指定位置栈的栈顶元素。我们可以通过list拿到指定index的栈，拿到之后执行stack的pop操作即可。同时如果弹出栈顶元素之后，当前stack变成空了，需要将当前stack从list中移除。


 */


class StackOfPlates {
    List<Stack<Integer>> stackList;
    int cap;

    public StackOfPlates(int cap) {
        stackList = new ArrayList<>();
        this.cap = cap;
    }

    public void push(int val) {
        if (cap <= 0) { // 当容量小于等于0时
            return;
        }
        //当没有栈，或者栈满了的时候，就需要新建栈了
        if (stackList.isEmpty() || stackList.get(stackList.size() - 1).size() == cap) {
            Stack<Integer> stack = new Stack<>();
            stack.push(val);
            stackList.add(stack);
            return;
        }
        //不需要新建栈的时候，直接插入元素即可
        stackList.get(stackList.size() - 1).push(val);
    }

    //pop是选择最后一个栈的栈顶元素出栈，所以可以直接调用popAt
    public int pop() {
        return popAt(stackList.size() - 1);
    }
    //popAt是选择指定的栈出栈
    public int popAt(int index) {
        if (index < 0 || index >= stackList.size()) {
            return -1;
        }
        Stack<Integer> stack = stackList.get(index);
        if (stack.isEmpty()) {
            return -1;
        }
        int res = stack.pop();
        if (stack.isEmpty()) {
            stackList.remove(index);
        }
        return res;
    }
}

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates obj = new StackOfPlates(cap);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAt(index);
 */