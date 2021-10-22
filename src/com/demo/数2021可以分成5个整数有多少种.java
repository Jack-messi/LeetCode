package com.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class 数2021可以分成5个整数有多少种 {

    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        File file = new File("result.txt");
        fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);

//        int count = 0;

        BigDecimal count = new BigDecimal("0");

        int a, b, c, d, e;
        for (a = 1; a <= 2021; a++) {
            for (b = 1; b <= 2021; b++) {
                long t = (1+(2021 - (a + b )))*(2021 - (a + b ))/2;
//                System.out.println(t);
                String s = t+"";
                BigDecimal temp = new BigDecimal(s);
                count=count.add(temp);

                System.out.println(count );

            }
        }
        System.out.println(count);
    }

}
