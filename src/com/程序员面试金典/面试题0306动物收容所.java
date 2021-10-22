package com.程序员面试金典;

import java.util.LinkedList;
import java.util.Queue;

public class 面试题0306动物收容所 {
}
/*
思路：
题目中，序号是连续自增的
用两个队列，一个存储狗，一个存储猫，利用先进先出原则。
出任意一个宠物的时候，就判断哪一个宠物序号要小。就出哪一个

 */

class AnimalShelf {
    Queue<Integer> queueCat = new LinkedList<>();
    Queue<Integer> queueDog = new LinkedList<>();

    public AnimalShelf() {

    }

    public void enqueue(int[] animal) {
        if (animal[1] == 0) {
            queueCat.add(animal[0]);
            queueCat.add(animal[1]);
        } else {
            queueDog.add(animal[0]);
            queueDog.add(animal[1]);
        }
    }

    public int[] dequeueAny() {
        if ((!queueDog.isEmpty() && !queueCat.isEmpty())) {
            if (queueCat.peek() < queueDog.peek()) {
                return new int[]{queueCat.poll(), queueCat.poll()};
            } else {
                return new int[]{queueDog.poll(), queueDog.poll()};
            }
        } else if (!queueDog.isEmpty()) {
            return dequeueDog();
        } else if (!queueCat.isEmpty()) {
            return dequeueCat();
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueDog() {
        if (!queueDog.isEmpty()) {
            return new int[]{queueDog.poll(), queueDog.poll()};
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueCat() {
        if (!queueCat.isEmpty()) {
            return new int[]{queueCat.poll(), queueCat.poll()};
        }
        return new int[]{-1, -1};
    }
}