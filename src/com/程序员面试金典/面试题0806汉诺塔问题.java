package com.程序员面试金典;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.ArrayList;
import java.util.List;

public class 面试题0806汉诺塔问题 {
}


/*
采用递归的思路
三要素如下：
递归结束条件：只剩下最后一个盘子需要移动
递归函数主功能：
1.首先将 n-1 个盘子，从A，通过C转移到B；
2.然后将最后一个盘子移动到第C上
3.最后将第B上的 n-1 个盘子，通过B移动到C上
函数的等价关系式：
f(n,A,B,C) 表示将n个盘子从A移动到C
f(n,A,B,C)=f(n-1,A,C,B)+f(1,A,B,C)+f(n-1,B,A,C)


n = 1 时，直接把盘子从 A 移到 C；
n > 1 时，
    先把上面 n - 1 个盘子从 A 移到 B（子问题，递归）；
    再将最大的盘子从 A 移到 C；
    再将 B 上 n - 1 个盘子从 B 移到 C（子问题，递归）。



 */


class Solution08061 {

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(0);

        hanota(A,B,C);

    }

    public static void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        move(n, A, B, C);
    }
    //定义move 函数移动汉诺塔
    //因为列表中，数组下标小的，其数据越大
    public static void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            C.add(A.get(A.size()-1));
            A.remove(A.size()-1);
            return;
        } else {
            move(n - 1, A, C, B);        //将A上面n-1个通过C移到B
            C.add(A.get(A.size()-1));           //将A最后一个移到C，将最后一个列表下标内的数据取出。
            A.remove(A.size()-1);         //清空 最后一个列表下标内的数据取出。
            move(n - 1, B, A, C);        //将B上面n-1个通过空的A移到C
        }
    }
}



class Solution0806 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        movePlant(A.size(),A,B,C);
    }
    //size 需要移动的盘子的数量
    public void movePlant(int size,List<Integer> A,List<Integer> B,List<Integer> C){
        //当只剩一个盘子时，直接将它从第一个柱子移动到第三个柱子
        if(size == 1){
            C.add(A.remove(A.size()-1));
            return;
        }
        //首先将 n-1 个盘子，从第一个柱子移动到第二个柱子
        movePlant(size - 1,A,C,B);
        //然后将最后一个盘子移动到第三个柱子上
        C.add(A.remove(A.size()-1));
        //最后将第二个柱子上的 n-1 个盘子，移动到第三个柱子上
        movePlant(size - 1,B,A,C);

    }
}





class Solution08062 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        movePlant(A.size(), A, B, C);
    }

    //size 需要移动的盘子的数量
    //start 起始的柱子
    //auxiliary 辅助柱子
    //target 目标柱子
    public void movePlant(int size, List<Integer> start, List<Integer> auxiliary, List<Integer> target) {
        //当只剩一个盘子时，直接将它从第一个柱子移动到第三个柱子
        if (size == 1) {
            target.add(start.remove(start.size() - 1));
            return;
        }
        //首先将 n-1 个盘子，从第一个柱子移动到第二个柱子
        movePlant(size - 1, start, target, auxiliary);
        //然后将最后一个盘子移动到第三个柱子上
        target.add(start.remove(start.size() - 1));
        //最后将第二个柱子上的 n-1 个盘子，移动到第三个柱子上
        movePlant(size - 1, auxiliary, start, target);

    }
}
/*
class Solution:
    def hanota(self, A: List[int], B: List[int], C: List[int]) -> None:
        n = len(A)
        self.move(n, A, B, C)
    # 定义move 函数移动汉诺塔
    def move(self,n, A, B, C):
        if n == 1:
            C.append(A[-1])
            A.pop()
            return
        else:
            self.move(n-1, A, C, B)  # 将A上面n-1个通过C移到B
            C.append(A[-1])          # 将A最后一个移到C
            A.pop()                  # 这时，A空了
            self.move(n-1,B, A, C)   # 将B上面n-1个通过空的A移到C

 */