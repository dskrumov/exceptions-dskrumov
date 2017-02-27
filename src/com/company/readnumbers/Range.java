package com.company.readnumbers;

public class Range {

    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public boolean contains(int number) throws OutofRangeException {
        boolean result = true;
        if (number <= end && number >= start) {
            return result;
        } else throw new OutofRangeException("False: Numbers out of range");


    }
}