package com.程序员面试金典;

public class 面试题0504下一个数 {
}


/*


大佬的思路:
要想找到比本身大一点的数首先从二进制数右端向左找,找到第一个01,将01变成10,再将右端的所有1全部置于右端低位,右端其余位为0;

要想找到比本身小一点的数首先从二进制数右端向左找,找到第一个10,将10变成01,再将右端的所有1全部置于右端高位,右端其余位为0;


代码


 */

class Solution4334 {
    public static void main(String[] args) {
//        int num = 1024;//214748
//        char[] c = ('0' + Integer.toBinaryString(num)).toCharArray();
//        String ss = String.valueOf(c);
//
////        num = (int) Integer.parseInt("11010011011");
//        System.out.println(c);
//        num = charBinaryToDecimal(c);
//
//
//        System.out.println(num);
        System.out.println(findClosedNumbers(2147483647));

    }

    public static int[] findClosedNumbers(int num) {

        //对int能取到最大的数据，要做特殊处理
        if(num==2147483647)
        {
            return new int[]{-1,-1};
        }

        char[] to_small = ('0' + Integer.toBinaryString(num)).toCharArray();
        char[] to_big = ('0' + Integer.toBinaryString(num)).toCharArray();

        //找小
        int a = -1;
        for (int i = to_small.length - 1; i > 0; i--) {
            if (to_small[i] == '0' && to_small[i - 1] == '1') {
                to_small[i] = '1';
                to_small[i - 1] = '0';
                //将右端的所有1全部置于右端高位,右端其余位为0;
                for (int left = i + 1, right = to_small.length - 1; left < right; ) {
                    while (left < right && to_small[left] == '1') {
                        left++;
                    }
                    while (left < right && to_small[right] == '0') {
                        right--;
                    }
                    if (left != right) {
                        to_small[left] = '1';
                        to_small[right] = '0';
                    }
                }
                a = charBinaryToDecimal(to_small);
                break;
            }

        }

        //找大
        int b = -1;
        for (int i = to_big.length - 1; i > 0; i--) {
            if (to_big[i] == '1' && to_big[i - 1] == '0') {
                to_big[i] = '0';
                to_big[i - 1] = '1';
                //将右端的所有1全部置于右端低位,右端其余位为0
                for (int left = i + 1, right = to_big.length - 1; left < right; ) {
                    while (left < right && to_big[left] == '0') {
                        left++;
                    }
                    while (left < right && to_big[right] == '1') {
                        right--;
                    }
                    if (left != right) {
                        to_big[left] = '0';
                        to_big[right] = '1';
                    }

                }
                b = charBinaryToDecimal(to_big);
                break;
            }
        }

        return new int[]{b, a};
    }
    //将二进制字符数组转换为十进制整型数据
    public static int charBinaryToDecimal(char[] c) {
        double num = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (i == 0 && c[i] == 0) {
                continue;
            }
            if (c[i] != '0') {
                num = num + ((int) c[i] - (int) '0') * Math.pow(2, c.length - 1 - i);
            }
        }
        return (int) num;
    }


    public int binaryToDecimal1(int n) {
        int t = 0; // 用来记录位数
        int bin = 0; // 用来记录最后的二进制数
        int r = 0; // 用来存储余数

        while (n != 0) {
            r = n % 2;
            n = n / 2;
            //原作者的方法是：bin += r * Math().pow(10, t),这样写报错，就改成下面这样了，pow（）方法，求取x的y次方，数值类型是double;
            bin += r * Math.pow(10, t);
            t++;
        }
        return bin;
    }
}