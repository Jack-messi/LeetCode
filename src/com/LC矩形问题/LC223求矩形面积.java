package com.LC矩形问题;

public class LC223求矩形面积 {
    public static void main(String[] args) {
        System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        if (C <= E || G <= A || H <= B || D <= F)//没有交集的情况下,直接输出两个矩形面积
            return (area1 + area2);

        int x1 = Math.max(A, E);
        int x2 = Math.min(C, G);
        int y1 = Math.min(H, D);
        int y2 = Math.max(B, F);

        int area3 = (x2 - x1) * (y1 - y2);
        return area1 - area3 + area2;

    }
}
