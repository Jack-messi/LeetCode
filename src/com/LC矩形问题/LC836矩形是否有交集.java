package com.LC矩形问题;

public class LC836矩形是否有交集 {
    public static void main(String[] args) {
        int[] a = new int[]{-1,0,1,1};
        int[] b = new int[]{0,-1,0,1};
        System.out.println(isRectangleOverlap(a, b));
    }

//    public static boolean isOverlap(int[] rec1, int[] rec2) {
//        boolean flag = false;
////        int[] c = new int[8];
//
//        int[] x = new int[]{rec2[0], rec2[2], rec2[0], rec2[2]};
//        int[] y = new int[]{rec2[1], rec2[3], rec2[3], rec2[1]};
//
//
//        for (int i = 0; i < x.length; i++) {
//            if ((x[i] > rec1[0] && x[i] < rec1[2]) && (y[i] > rec1[1] && y[i] < rec1[3])) {
//                flag = true;
//                break;
//            }
//            if(x[i]>)
//        }
//
//        return flag;
//    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean flag=false;
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0] || rec1[3] <= rec2[1] || rec2[3] <= rec1[1])
            flag = false;
        else
            flag = true;

        if(rec1[2]==rec1[0]||rec1[1]==rec1[3]||rec2[2]==rec2[0]||rec2[1]==rec2[3])
            flag=false;

         return flag;
    }
}
