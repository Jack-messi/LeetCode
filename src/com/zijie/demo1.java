package com.zijie;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int a = sc.nextInt();


        System.out.println(result(b.length(),a));
    }

    public static int result(int a,int b){
        int s1=1,s2=1,sum=0;
        if((a-b)>b)
        {
            for(int i=a-b+1;i<=a;i++)
            {
                s1*=i;
            }
            for(int i=1;i<=b;i++){
                s2*=i;
            }
            sum = s1/s2;
        }else{
            for(int i=b+1;i<=a;i++)
            {
                s1*=i;
            }
            for(int i=1;i<=a-b;i++){
                s2*=i;
            }
            sum = s1/s2;
        }
        return sum;

    }
}