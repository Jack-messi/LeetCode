
package com.zijie;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        String s1 = sc.nextLine();
        char[] arr = s1.toCharArray();


        for(int i=0;i<q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=a-1;j<b;j++)
            {
                if(arr[j]=='1')
                {
                    arr[j]=0;
                }
                arr[j]=1;
            }
        }
        System.out.println(arr.toString());
    }
}