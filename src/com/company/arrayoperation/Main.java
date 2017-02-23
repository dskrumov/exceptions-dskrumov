package com.company.arrayoperation;


public class Main {
    public static void main(String[] args) throws ArrayRangeException {
        try {

            Array array = new Array(4);
            array.add(2);
            array.add(2);
            array.add(2);
            array.add(2);
            array.printElements();
            array.removeElements();

        } catch (NegativeArraySizeException exc) {
            System.out.println("Invalid size of Array. Enter Positive size number");
        }
    }


}
