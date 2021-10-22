package com.demo;

import java.util.*;

public class GDUT {
    public static void main(String[] args) {
        int[] arr = new int[102];
        System.out.println(arr[2]);
    }
}
//class Demo
//{
//    public static int remove_01(String arr)
//    {
//        int len = arr.length();
//        int num1 = arr.
//    }
//
//    public static int count(String arr,char a)
//    {
//        for (int i=0;i)
//    }
//}

//class Solution {
//    public static void main(String[] args) {
//        int[] arr = printNumbers(4);
//        for (int i = 1; i <= 9999; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    public static int[] printNumbers(int n) {
//        String s = "";
//        for (int i = 1; i <= n; i++) {
//            s = s + 9;
//        }
//        int num = Integer.parseInt(s);
//        int[] arr = new int[num+1];
//        for (int i = 1; i <= num; i++) {
//            arr[i]=i;
//        }
//
//        return arr;
//    }
//}


//class Solution {
//    public int[] exchange(int[] nums) {
//        int len = nums.length;
//        int[] arr = new int[len];
//        int count=0;
//        for (int i=0;i<len;i++)
//        {
//            if (nums[i]%2==1)
//            {
//                arr[count++]=nums[i];
//            }
//        }
//        for (int i=0;i<len;i++)
//        {
//            if (nums[i]%2==0)
//            {
//                arr[count++]=nums[i];
//            }
//        }
//        return arr;
//    }
//}


//class Solution {
//    public int majorityElement(int[] nums) {
//        int len = nums.length;
//        Map<Integer, Integer> counts = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            int count = counts.getOrDefault(nums[i], 0) + 1;
//            if (count > len / 2) {
//                return nums[i];
//            }
//            counts.put(nums[i], count);
//        }
//        return -1;
//    }
//}


class asc {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String s = "ttttt";
        hm.put('s', 1);
        hm.put('b', 1);
        int x;
        for (int i = 0; i < 5; i++) {
            x = hm.getOrDefault(s.charAt(i), 0);
            hm.put(s.charAt(i), 1 + x);
        }
        System.out.println(hm.getOrDefault(s.charAt(2), 0));
    }
}

class Solutionw1 {
    public static void main(String[] args) {
        String s = "ttttccc";
        String t = "ttttsccc";
        char c = findTheDifference(s, t);
        System.out.println(c);
    }

    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();
        int i, j = 0, x;
        s = "ttttt";
        for (i = 0; i < s.length(); i++) {
            x = hms.getOrDefault(s.charAt(i), 0);

            hms.put(s.charAt(i), 1 + x);
            System.out.println(s.charAt(i) + " " + x);
            x = hmt.getOrDefault(t.charAt(i), 0);
            hmt.put(t.charAt(i), 1 + x);

        }
        for (i = 0; i < t.length(); i++) {

        }
        System.exit(0);

        x = hmt.getOrDefault(t.charAt(i), 0);
        hms.put(t.charAt(i), 1 + x);

        for (i = 0; i < t.length(); i++) {
            int x1 = hms.getOrDefault(t.charAt(i), -1);
            int x2 = hmt.getOrDefault(t.charAt(i), -1);
            if (x1 != x2) {
                j = i;
                break;
            }
        }

        return t.charAt(j);
    }
}

class hashj{
    public static void main(String[] args) {
        //用数组创建哈希表,数组索引为key，数组值为value
        String[] hashTable = new String[4];

        //用HashMap函数来创建哈希表
        HashMap<Integer,String> map = new HashMap<>();

        //用数组创建哈希表,添加元素
        hashTable[1] = "lihua1";
        hashTable[2] = "lihua2";
        hashTable[3] = "lihua3";

        //用HashMap函数来创建哈希表，添加元素
        map.put(1,"lihua1");
        map.put(2,"lihua2");
        map.put(3,"lihua3");

        //修改元素
        hashTable[1] = "zhanger";
        map.put(1,"zhanger");

        //删除元素
        hashTable[1]="";
        map.remove(1);

        //获取元素
        String temp = hashTable[3];
        map.get(3);

        //检查key是否存在
        map.containsKey(3);

        //查看hash表的长度
        map.size();

        //查看hash表是否为空
        map.isEmpty();


    }
}

class demo1{
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<Integer> set = new HashSet<>();

        //添加元素
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(12);

        //搜索元素
        set.contains(11);

        //删除元素
        set.remove(2);
        System.out.println(set.toString());

        //hash长度
        set.size();

    }
}


















