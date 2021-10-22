package com.meituan;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,k;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();


        //创建链表
        LinkedList<Integer> list = new LinkedList<>();

        //链表中添加数据O(1)
        list.add(1);
        list.add(2);
        list.add(3);

        //链表中插入的位置和元素O(N),在2位置插入99
        list.add(2,99);

        //搜索元素,返回该值的索引O(N)
        int index = list.indexOf(99);

        //更新元素，O(N)，把2号位置的值，变为88
        list.set(2,88);

        //删除元素,O(N),删除索引为2的元素
        list.remove(2);

        //链表长度,O(1)
        int length = list.size();


        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());


    }
}


























