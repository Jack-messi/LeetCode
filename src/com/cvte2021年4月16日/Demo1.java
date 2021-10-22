package com.cvte2021年4月16日;
import java.util.Arrays;
public class Demo1 {
}



 class Test2 {
    public static void main(String[] args) {
        //1.测试数组a和b
//      int a[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 989 };
//      int b[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int a[] = {20,30,40,50};
        int b[] = {10};

        //2.调用处理数组的函数
        getMinusArray(a, b);

        //3.打印处理实现最小差值的数组a和b--a和b各自的和--
        System.out.println("交换处理后的数组a："+Arrays.toString(a));
        System.out.println("交换处理后的数组b："+Arrays.toString(b));
        System.out.println("getSum(a)="+getSum(a));
        System.out.println("getSum(b)="+getSum(b));
        System.out.println("交换后a和b的差值：getSum(a)-getSum(b)="+Math.abs(getSum(a)-getSum(b)));
    }

    //两数组进行元素交换实现最小差值
    public static void getMinusArray(int[] a, int[] b) {
        // 数组a和b的和
        int suma = getSum(a);
        int sumb = getSum(b);

        int startMinus = Math.abs(suma - sumb);
//      System.out.println("startMinus="+startMinus);
        int minus = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++) {
                //先交换
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                //交换后的差值
                minus = Math.abs(getSum(a) - getSum(b));
                if(minus<startMinus){
                    startMinus = minus;
                }else{
                    //若交换后，差值比原来大或相等，则不交换--即重新换回来
                    int temp2=a[i];
                    a[i]=b[j];
                    b[j]=temp2;
                }
            }
        }
    }

    // 求数组和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
