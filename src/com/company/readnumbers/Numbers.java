package com.company.readnumbers;

public class Numbers {

    private int start;
    private int end;


    public void range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setNumbers(int a, int b) throws OutofIntegerRange {
        boolean result = true;
        boolean result2 = false;
        if (a > start || end < 0) {
            throw new OutofIntegerRange("Out of range - Integer a - " + result2);
        } else if (b > 10 || b < 0) {
            throw new OutofIntegerRange("Out of range - Integer b - " + result2);
        } else System.out.println(a);
        System.out.println(result);
        System.out.println(b);
        System.out.println(result);
    }
}