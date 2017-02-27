package com.company.arrayoperation;


public class Main {
    public static void main(String[] args) throws ArrayRangeException {
        try {

            Array array = new Array(5);
            array.add(1);
            array.add(2);
            array.add(3);

            array.printElements();
            System.out.println(" ");
            array.removeElement();
            array.printElements();

        } catch (NegativeArraySizeException exc) {
            System.out.println("Invalid size of Array. Enter Positive size number");
        }
    }
}