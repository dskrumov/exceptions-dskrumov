package com.company.arrayoperation;


public class Array {
    /**
     * Fields
     */
    private int[] array;
    private int val;

    /**
     *
     * @param size is the size of the array.
     */
    public Array(int size) {
        array = new int[size];
    }

    /**
     * Add method to add values in the array
     * @param Array is the array
     * @throws arrayRangeException is the custom exception
     */
    public void add(int Array) throws arrayRangeException {
        if (val < array.length) {
            array[val] = Array;
            val++;
        } else
            throw new arrayRangeException("Out of range Array. Set bigger Array size.");
    }

    /**
     * Print all elements of the array
     */
    public void printElements() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    /**
     * Remove the last element of the array.
     * @throws arrayRangeException is the custom exception
     */
    public void removeElements() throws arrayRangeException {

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(" " + array[i]);
            if (array[i] == 0) {
                throw new arrayRangeException("You can not remove a element from an empty Array");
            }
        }
    }


}





















