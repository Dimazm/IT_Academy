package com.rakovets.course.javabasics.practice.workbook;

import java.security.spec.RSAOtherPrimeInfo;

public class Task03 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;

        System.out.println("byte = "+ b +"\nshort = "+ s +"\nint = "+ i +"\nlong = "+ l +"\nchar = "
        + c +"\nfloat = "+ f +"\ndouble ="+ d +"\nboolean = "+ bool );


    }
}
