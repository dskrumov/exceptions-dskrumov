package com.company.readnumbers;

public class Read {
    public void ReadNumbers(int a, int b) throws Customexception {
        boolean result = true;
        boolean result2 = false;
        if (a > 10 || a < 0) {
            throw new Customexception("Out of range - Integer a - " + result2);
        } else if (b > 10 || b < 0) {
            throw new Customexception("Out of range - Integer b - " + result2);
        } else System.out.println(a);
        System.out.println(result);
        System.out.println(b);
        System.out.println(result);
    }
}