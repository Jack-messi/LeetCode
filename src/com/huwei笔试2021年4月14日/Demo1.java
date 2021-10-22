package com.huwei笔试2021年4月14日;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> temp = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ')')//如果不是右括号则入栈
            {
                stack.push(s.charAt(i));
            } else { //否则的话遇到了右括号，则出栈再入队，直到遇到左括号
                while (!stack.isEmpty() && (c = stack.pop()) != '(') {
                    queue.add(c);
                }
                while (!queue.isEmpty()) {
                    stack.push(queue.poll());
                }
            }
        }
        StringBuilder news = new StringBuilder();
        while (!stack.isEmpty()) {

            temp.push(stack.pop());
        }
        while (!temp.isEmpty()) {
            news.append(temp.pop());
        }
        System.out.println(news);
    }
}
//((jhku)(love)i)