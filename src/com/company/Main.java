package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(str);
        }
        if (scanner.hasNextInt()) {

        }
        if (scanner.hasNextFloat()) {

        }
        scanner.close();
    }
}

class Person {
    public static String name;

//    static {
//        name = "Tom";
//    }


    public static void setName(String name) {
        Person.name = name;
    }

    public static String getName() {
        return name;
    }

    public Person() {
        name = "zs";
    }


    public static void main(String[] args) {
        setName("1111");
        setName("2222");


    }
}
