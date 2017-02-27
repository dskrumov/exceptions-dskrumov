package com.company.arrayoperation;

public class Array {
    /**
     * Fields
     */
    private int[] array;
    private int index;

    /**
     * @param size is the size of the array.
     */
    public Array(int size) {
        array = new int[size];
    }

    /**
     * Add method to add values in the array
     *
     * @param array is the array
     * @throws ArrayRangeException is the custom exception
     */
    public void add(int array) throws ArrayRangeException {
        if (index < this.array.length) {
            this.array[index] = array;
            index++;
        } else
            throw new ArrayRangeException("Out of range array. Set bigger array size.");
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
     *
     * @throws ArrayRangeException is the custom exception
     */
    public void removeElements() throws ArrayRangeException {


        }

    }

























