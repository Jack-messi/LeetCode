package com.huwei笔试2021年4月14日;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int n = sc.nextInt();

        getCalcExpression(min, max, n);

    }

    public static void getCalcExpression(int min, int max, int n) {

        int op[] = new int[n];//运算符
        int result[] = new int[n];//结果
        int a, b;

        for (int i = 0; i < n; i++) {
            op[i] = (int) (Math.random() * 2);
            a = (int) (Math.random() * (max - min)) + min;
            b = (int) (Math.random() * max) + min;

            System.out.print(a + getOp(op[i]) + b + "=( )");
            result[i] = jisuan(a, b, op[i]);
            System.out.println("     " + result[i]);

        }
    }
    private static String getOp(int index) {
        String string = "";
        switch (index) {
            case 0:
                string = "+";
                break;
            case 1:
                string = "-";
                break;
//            case 2:
//                string = "*";
//                break;
//            case 3:
//                string = "/";
//                break;
        }
        return string;
    }


    private static int jisuan(int a, int b, int index) {
        int sum = 0;
        switch (index) {
            case 0:
                sum = a + b;
                break;
            case 1:
                sum = a - b;
                break;
//            case 2:
//                sum = a * b;
//                break;
//            case 3:
//                sum = a / b;
//                break;
        }
        return sum;
    }


}
