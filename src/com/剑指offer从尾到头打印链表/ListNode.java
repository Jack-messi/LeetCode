package com.剑指offer从尾到头打印链表;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


        /*

        ListNode head = new ListNode(1);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(2);

        head.next = h2;
        h2.next = h3;
        h3.next = null;

//        ListNode h=  head;
//
//        while (h!=null)
//        {
//            System.out.println(h.val);
//            h=h.next;
//        }
        ListNode node = head;
        int count = 0;
        while (node!=null)
        {
            count++;
            node = node.next;
        }

        int[] nums = new int[count];
        node = head;
        for(int i = count-1;i>0;i--)
        {
            nums[i] = node.val;
            node = node.next;
        }
//        return nums;

*/


//class Solution {
//    public static void main(String[] args) {
//        int[] numbers = new int[]{3, 4, 5, 1, 2};
//        System.out.println(minArray(numbers));
//    }
//
//    public static int minArray(int[] numbers) {
//        Arrays.sort(numbers);
//        return numbers[0];
//    }
//}


class JavaSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 1, 4};
        Bubble_Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //通过交换进行插入排序，借鉴冒泡
    public static void Insert_Sort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    //希尔排序，还没弄懂
    public static void shell_Sort(int[] arr) {
        int length = arr.length;
        //区间
        int gap = 1;
        while (gap < length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                //跨区间排序
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = gap / 3;
        }
    }

    //简单选择排序
    public static void Selection_Sort(int[] arr) {
        int len = arr.length;
        int min, temp;
        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    //冒泡排序
    public static void Bubble_Sort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //插入排序
    public static void Select_sort(int[] arr) {

        //插入排序
        for (int i = 1; i < arr.length; i++) {
            //外层循环，从第二个开始比较
            for (int j = i; j > 0; j--) {
                //内存循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    //如果不小于，说明插入完毕，退出内层循环
                    break;
                }
            }
        }
    }

//    public static void main(String[] args) {
//
//        int arr[] = {7, 5, 3, 2, 4, 1, 8, 9, 6};
//
//        //快速排序
//        int low = 0;
//        int high = arr.length - 1;
//        quickSort(arr, low, high);
//    }

    //快速排序
    public static void quickSort(int[] arr, int low, int high) {
        //如果指针在同一位置(只有一个数据时)，退出
        if (high - low < 1) {
            return;
        }
        //标记，从高指针开始，还是低指针（默认高指针）
        boolean flag = true;
        //记录指针的其实位置
        int start = low;
        int end = high;
        //默认中间值为低指针的第一个值
        int midValue = arr[low];
        while (true) {
            //高指针移动
            if (flag) {
                //如果列表右方的数据大于中间值，则向左移动
                if (arr[high] > midValue) {
                    high--;
                } else if (arr[high] < midValue) {
                    //如果小于，则覆盖最开始的低指针值，并且移动低指针，标志位改成从低指针开始移动
                    arr[low] = arr[high];
                    low++;
                    flag = false;
                }
            } else {
                //如果低指针数据小于中间值，则低指针向右移动
                if (arr[low] < midValue) {
                    low++;
                } else if (arr[low] > midValue) {
                    //如果低指针的值大于中间值，则覆盖高指针停留时的数据，并向左移动高指针。切换为高指针移动
                    arr[high] = arr[low];
                    high--;
                    flag = true;
                }
            }
            //当两个指针的位置相同时，则找到了中间值的位置，并退出循环
            if (low == high) {
                arr[low] = midValue;
                break;
            }
        }
        //然后出现有，中间值左边的小于中间值。右边的大于中间值。
        //然后在对左右两边的列表在进行快速排序
        quickSort(arr, start, low -1);
        quickSort(arr, low + 1, end);
    }

}






