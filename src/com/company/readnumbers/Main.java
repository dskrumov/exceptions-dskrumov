package com.company.readnumbers;

public class Main {
    public static void main(String[] args) throws OutofRangeException {
        Range numbers = new Range();
        numbers.range(1, 10);
        numbers.contains(2, 2);
    }
}