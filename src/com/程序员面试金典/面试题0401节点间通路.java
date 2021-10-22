package com.程序员面试金典;

import java.util.*;

public class 面试题0401节点间通路 {
}
/*
思路：
1、先遍历数组，生成一个邻接矩阵edges
2、对edges进行深度优先搜索遍历，
 */

   /*
        BFS
        使用 BFS，那么就需要队列，这相当于是求路径
	遍历的过程中我们肯定需要知道某个点它所能到达哪些点，我们总不能在队列遍历过程中对于每个点都去遍历一遍数组吧
	因此，我们可以先做预处理，提前先将每个点所能到达的点存储起来，后续直接获取即可

	queue 存储的是下一次循环需要看的点，比如最开始我们存储 start，那么我们就需要得到 start 下一步所能到达的点
	然后将这些点存储到 queue 中，下一次循环就遍历这些点，继续获取它们下一步所能到达的点

	当遍历过程中出现了 target，表示能够到达目的地

	怎么防止对某些点的重复访问呢？
	方法一：建立一个 set 存储遍历过的点 或 建立一个 boolean 数组存储访问过的点
	方法二：我们预处理是将每个点下一步所能到达的点给存储到 list 中，而我们能获取这个 list 如果为空，
		表示它不能通往任何其他节点，那么同样的，也可以当作是该点已经访问过了
		因此，我们访问过一个节点，就将该节点的 list 置空，下次访问到它的时候，获取的 list 为空，自然就跳过了
        */


//BFS解决
class Solution222 {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        //用hashmap来存储a节点和a节点能到达的节点（边）
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] a : graph) {
            if (!map.containsKey(a[0])) {
                map.put(a[0], new ArrayList<>());
            }
            map.get(a[0]).add(a[1]); //将a[1]节点添加到以a[0]节点为首的list链表中
        }

        //队列存放接下来要遍历的节点
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int st = queue.poll();
                List<Integer> list = map.get(st);
                //如果list==null，表示当前st节点，不能通往其他任何一个节点，或 之前已经访问过了。
                if (list == null) {
                    continue;
                }
                for (int num : list) {
                    if (num == target) {
                        return true;
                    }
                    queue.add(num);
                }
                map.put(st, null);
            }
        }
        return false;

    }
}

//DFS解决，使用递归
class Solution33 {

    //用hashmap来存储a节点和a节点能到达的节点（边）
    Map<Integer, List<Integer>> map = new HashMap<>();
    boolean valid = false;  //
    boolean[] visit; //visit用来标记是否走过的节点

    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        for (int[] a : graph) {
            if (!map.containsKey(a[0])) {
                map.put(a[0], new ArrayList<>());
            }
            map.get(a[0]).add(a[1]);
        }
        visit = new boolean[n];
        dfs(start, target);
        return valid;
    }

    public void dfs(int start, int target) {
        visit[start] = true;
        if (valid) {
            return;
        }
        if (start == target) {
            valid = true;
            return;
        }
        if (map.get(start) != null) {
            for (int i : map.get(start)) {
                if (!visit[i]) {
                    dfs(i, target);
                }
            }
        }
    }
}

//DFS解决，使用栈
class Solution332 {

    //用hashmap来存储a节点和a节点能到达的节点（边）
    Map<Integer, List<Integer>> map = new HashMap<>();
    boolean valid = false;  //
    boolean[] visit; //visit用来标记是否走过的节点
    Stack<Integer> stack = new Stack<>();

    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        for (int[] a : graph) {
            if (!map.containsKey(a[0])) {
                map.put(a[0], new ArrayList<>());
            }
            map.get(a[0]).add(a[1]);
        }
        visit = new boolean[n];
        stack.add(start);
        while (!stack.isEmpty()) {

        }


        dfs(start, target);
        return valid;
    }

    public void dfs(int start, int target) {
        visit[start] = true;
        if (valid) {
            return;
        }
        if (start == target) {
            valid = true;
            return;
        }
        if (map.get(start) != null) {
            for (int i : map.get(start)) {
                if (!visit[i]) {
                    dfs(i, target);
                }
            }
        }
    }
}

















