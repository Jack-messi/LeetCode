package com.ali笔试2021年4月21日;

import java.util.Arrays;
import java.util.Scanner;

public class aliDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int aj = a[n - 2], ai = a[n - 1];
        int num = ai * aj + ai - aj;
        System.out.println(num);

    }
}
