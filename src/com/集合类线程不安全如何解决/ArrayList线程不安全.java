package com.集合类线程不安全如何解决;

import java.util.*;

public class ArrayList线程不安全 {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        list.add(1);
        System.out.println(list.size());
        int[] aa = new int[3];
        System.out.println();
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();


        Set<Integer> set1 = new TreeSet<>();
        set1.add(-1);
        set1.add(-2);
        set1.add(11);
        set1.add(3);
        System.out.println(set1.toString());

        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();

        int n = 32;
        int hase = 14;
        System.out.println(hase % (n));
        System.out.println((n - 1) & hase);
        System.out.println(hase & (n - 1));


    }
}
