package com.company.readnumbers;

public class Main {
    public static void main(String[] args) throws OutofRangeException {


        Range numbers = new Range(1, 10);

        numbers.contains(2);
        numbers.contains(3);
        numbers.contains(0);
    }
}