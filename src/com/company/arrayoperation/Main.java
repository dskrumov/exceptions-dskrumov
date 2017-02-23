package com.company.arrayoperation;


public class Main {
    public static void main(String[] args) throws arrayRangeException {
        try {

            Array array = new Array(2);
            array.add(1);
            array.add(2);

            array.removeElements();
            array.printElements();

        } catch (NegativeArraySizeException exc) {
            System.out.println("Invalid size of Array. Enter Positive size number");
        }
    }


}
