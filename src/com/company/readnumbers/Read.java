package com.company.readnumbers;

/**
 * Created by clouway on 21.02.17.
 */
public class Read {
    public void ReadNumbers(int a, int b) throws customexception {
        boolean result = true;
        boolean result2 = false;
        if (a > 10 || a < 0) {
            throw new customexception("Out of range - Integer a - " + result2);
        } else if (b > 10 || b < 0) {
            throw new customexception("Out of range - Integer b - " + result2);
        } else System.out.println(a);
        System.out.println(result);
        System.out.println(b);
        System.out.println(result);


    }
}






