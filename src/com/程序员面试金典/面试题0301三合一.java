package com.程序员面试金典;

public class 面试题0301三合一 {
}


class TripleInOne {

    int[] arr;
    int stackSize;
    //记录 3 个栈每个栈可以插入的下标，本质上使用 3 个指针，这里直接简化使用一个大小为 3 的数组
    int[] indexs;
    public TripleInOne(int stackSize) {
        arr = new int[stackSize * 3];
        this.stackSize = stackSize;
        indexs = new int[]{0, 1, 2};
    }
    //stackNum 表示的是 3 个栈中某个选择某个栈的下标
    //入栈的时候，先判断栈是否是满。就看indexs数组是不是越界了，indexs指针数组，指向末尾元素的，下一个空间。
    public void push(int stackNum, int value) {
        //当前栈的可插入下标超过了界限，那么表示已经满了，不能再进行插入了
        if(indexs[stackNum] >= stackSize * 3){
            return;
        }
        arr[indexs[stackNum]] = value;
        indexs[stackNum] += 3;
    }

    //因为 indexs指针数组，指向末尾元素的，下一个空间。所以要先--，然后再去取值
    public int pop(int stackNum) {
        if(isEmpty(stackNum)){
            return -1;
        }
        indexs[stackNum] -= 3;
        return arr[indexs[stackNum]];
    }

    public int peek(int stackNum) {
        if(isEmpty(stackNum)){
            return -1;
        }
        return arr[indexs[stackNum] - 3];
    }

    public boolean isEmpty(int stackNum) {
        //当前栈的可插入下标 < 3，即为 0、1、2 时，表示还没有元素入栈，即为空
        return indexs[stackNum] < 3;
    }
}
