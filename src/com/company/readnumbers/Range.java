package com.company.readnumbers;

public class Range {

    private int start;
    private int end;


    public void range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean contains(int a, int b) throws OutofRangeException {
        boolean result = true;
        if (a < end && a > start && b < end && b >start) {
            return result;
        } else throw new OutofRangeException("False: Numbers out of range");


    }
}