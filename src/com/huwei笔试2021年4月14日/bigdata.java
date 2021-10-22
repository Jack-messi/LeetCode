package com.huwei笔试2021年4月14日;

import java.math.BigDecimal;
import java.util.Scanner;

public class bigdata {
    public static void main(String[] args) {
//        Scanner sc1 = new Scanner(System.in);
//
//        String s1 = sc1.nextLine();
//        String s2 = sc1.nextLine();
//
//        BigDecimal b1 = new BigDecimal(s1);
//        BigDecimal b2 = new BigDecimal(s2);
//
//        System.out.println(b1.add(b2));

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String n1 = new StringBuilder(s1).reverse().toString();
        String n2 = new StringBuilder(s2).reverse().toString();
        int l1 = n1.length();
        int l2 = n2.length();
        int maxL = l1>l2?l1:l2;

        //补齐0
        if (l1 < l2) {
            for (int i = l1; i < l2; i++) {
                n1 += "0";
            }
        }else {
            for (int i = l2; i < l1; i++) {
                n2 += "0";
            }
        }
        //System.out.println(n1);//test
        //System.out.println(n2);//test
        StringBuffer res = new StringBuffer();//存放的结果
        int c = 0;//进位

        for (int i = 0; i < maxL; i++) {
            int nSum = Integer.parseInt(n1.charAt(i) + "") + Integer.parseInt(n2.charAt(i) + "") + c;
            int ap = nSum%10;
            res.append(ap);
            c = nSum/10;
        }
        if (c>0) {
            res.append(c);
        }
        //System.out.println(res);//test
        System.out.println(res.reverse());

    }



}
