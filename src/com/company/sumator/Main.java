package com.company.sumator;

public class Main {

    public static void main(String[] args) {

        Sumator sum = new Sumator();
        try {
            System.out.println(sum.sum("1", "1"));
        } catch (NumberFormatException exc) {

            System.out.println("Enter string number");
            System.out.println(sum.sum("5", "5"));
        }
    }
}