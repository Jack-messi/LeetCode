package com.ali笔试2021年4月21日;

import java.util.Scanner;

public class aliDemo2 {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        int count = 0;
        int num = 0, k;
        int[] nums = new int[t];
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            for (k = a[i][0]; k <= a[i][1]; k++)
                num = k;
            while (flag) {
                num = num & (num - 1);
                count++;
                if (num==0)
                    flag=false;
            }
            if (count==a[i][2])
            {
                nums[i]++;
            }
        }
    }
}
