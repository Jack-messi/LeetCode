package com.程序员面试金典;

public class 面试题0508绘制直线 {
}


class Solution0508 {
    public int[] drawLine(int length, int w, int x1, int x2, int y) {
        int h = (length * 32) / w; //表示高度
        byte[][] screen = new byte[h][w];// 表示屏幕。是w*h(长x高)的，新建默认值为0
        //将第y行的x1到x2变为1（即画线）
        for (int i = 0, x = 0; i < w; ++i, ++x) {
            if (x1 <= x && x <= x2) {
                screen[y][x] = 1;
            }
        }
        //定义一个要返回的一维数组
        int[] aa = {123,123};
        int[] ans = new int[length];
        int[] temp = new int[32];

        for (int i = 0; i < h; ++i) { // h行
            for (int j = 0; j < w / 32; ++j) { // w/32的宽度
                int num = 0;
//                for (int k = 0; k < 32; ++k) {// 以为32位表示一个int值
//                    num <<= 1;
//                    num |= screen[i][32 * j + k];
//                }
                for (int k = 0; k < 32; k++) {
                    temp[k] = screen[i][32 * j + k];
                }

                ans[i * w / 32 + j] = intBinaryToDecimal(temp);
            }
        }
        return ans;
    }

    //二进制int数组转换为十进制
    public int intBinaryToDecimal(int[] a) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num <<= 1;
            num |= a[i];
        }
        return num;
    }

    //二进制char数组转换为十进制
    public int charBinaryToDecimal(char[] a) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            num <<= 1;
            num |= (int) (a[i] - (int) '0');
        }
        return num;
    }
}


class Test {

    public static void main(String[] args) {
        String s = "12";
        int num = 12;
        char[] c = Integer.toBinaryString(num).toCharArray();


    }

}

