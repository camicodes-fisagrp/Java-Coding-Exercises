package com.javacodingexercises.set6;

public class ArrayMagic {
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        // TODO: Write your code
        if (array.length == 0) {
            return false;
        }

        for (int value: array){
            if (value > number){
                return true;
            }
        }
        return false;
    }

    /**
     * This method finds and returns the second largest element in the given array.
     *
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */

    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        if (array.length == 0){
            return -1;
        }

        int largestElement = Integer.MIN_VALUE;

        int secondLargestElement = Integer.MIN_VALUE;

        for (int value: array){
            if (value > largestElement){
                secondLargestElement = largestElement;
                largestElement = value;
            } else if(value > secondLargestElement && value != largestElement){
                secondLargestElement = value;
            }
        }

        if (secondLargestElement == Integer.MIN_VALUE){
            return -1;
        }

        return secondLargestElement;
    }

    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {
        // TODO: Write code here
        if (array.length <= 1){
            return true;
        }

        for (int i = 0; i < array.length - 1; i++){
            if (array[ i + 1 ] < array[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * This method reverses an array.
     *
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {
        // TODO: Write your code here
        if(array.length < 1){
            return array;
        }

        int start = 0;
        int end = array.length - 1;

        int[] reversedArray = new int[array.length];

        while (start <= end){
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;
        }
        return reversedArray;
    }
}
