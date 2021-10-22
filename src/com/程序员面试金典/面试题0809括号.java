package com.程序员面试金典;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 面试题0809括号 {
}

//先dfs求出所有的情况
class Solution0809 {

    public static void main(String[] args) {
        List<String> res = generateParenthesis(2);
        for (String re : res) {
            System.out.println(re);
        }
    }

    public static List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        dfs("", n, res);
        return res;

    }

    public static void dfs(String paths, int n, List<String> res) {
        // 递归结束条件，如果字符串的长度 等于 n*2。说明结束此次递归
        if (paths.length() == n * 2)  //因为括号都是成对出现的，
        {
            res.add(paths);
            return;
        }
        dfs(paths + "(", n, res);//遍历左边的括号
        dfs(paths + ")", n, res); //遍历右边的括号
    }
}

//求出所有dfs情况后，再去掉一些没用的情况，好理解的方法
class Solution08091 {

    public static void main(String[] args) {
        List<String> res = generateParenthesis(3);
        System.out.println(res);
//        for (String re : res) {
//            System.out.println(re);
//        }
    }

    public static List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        dfs("", n, res);
        return res;

    }

    //通过dfs来遍历左右括号的树型图
    public static void dfs(String paths, int n, List<String> res) {
        if (paths.length() == n * 2)  //因为括号都是成对出现的
        {
            if (isTrue(paths)) {
                res.add(paths);
            }
            return;
        }
        dfs(paths + "(", n, res);
        dfs(paths + ")", n, res);
    }

    //用来判断是否是满足条件的左右括号匹配
    public static boolean isTrue(String paths) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < paths.length(); i++) {
            if (paths.charAt(i) == '(') {
                stack.add(paths.charAt(i));
            } else {
                if ((!stack.isEmpty() && (stack.peek() == '('))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}


class Solution08092 {

    public static void main(String[] args) {
        List<String> res = generateParenthesis(2);
        for (String re : res) {
            System.out.println(re);
        }
    }

    public static List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        dfs("", n, 0, 0, res);
        return res;

    }
    //剪枝后的dfs
    public static void dfs(String paths, int n, int left, int right, List<String> res) {
        if (left>n||right>left)//剪枝条件
        {
            return;
        }
        if (paths.length() == n * 2)  //因为括号都是成对出现的
        {
            res.add(paths);
            return;
        }
        dfs(paths + "(", n, left + 1, right, res);
        dfs(paths + ")", n, left, right + 1, res);
    }
}