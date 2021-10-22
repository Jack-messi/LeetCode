package com.程序员面试金典;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class 面试题0305栈排序 {
}


/*
思路：
使用优先队列做法，利用PriorityQueue的特性，使用比较函数，将数据从小到大存储在优先队列中。

 */
class SortedStack1 {

    PriorityQueue<Integer> priorityQueue;

    public SortedStack1() {
        priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    public void push(int val) {
        priorityQueue.add(val);
    }

    public void pop() {
        priorityQueue.poll();
    }

    public int peek() {
        if (!isEmpty()) {
            return priorityQueue.peek();
        } else {
            return -1;
        }

    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }
}
/*
解题思路：

1、始终维持栈元素从小到大的顺序；
2、每次push，寻找第一个大于等于val的位置处插入；
3、临时栈只用于暂存该位置之上的元素。

 */
class SortedStack {

    Stack<Integer> stack;
    Stack<Integer> tempStack;

    public SortedStack() {
        stack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void push(int val) {
        //找到合适的位置，插入val
        while (!stack.isEmpty() && stack.peek() < val) {
            tempStack.push(stack.pop());
        }
        stack.push(val);
        //将暂存在tempstack中的元素重新复原到stack中
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }

    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
        }
    }

    public int peek() {
        if (!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

/**
 * Your SortedStack object will be instantiated and called as such:
 * SortedStack obj = new SortedStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.isEmpty();
 */

