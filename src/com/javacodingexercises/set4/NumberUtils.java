package com.javacodingexercises.set4;

public class NumberUtils {
    public int getLastDigit(int number) {
        // Write your code here
        if (number < 0){
            return -1;
        }
        return number % 10;
    }

    /**
     * This method calculates and returns the number of digits in a given integer.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
     * @param number: an integer
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
    public int getNumberOfDigits(int number) {
        // Write your code here
        if(number < 0){
            return -1;
        }

        if (number == 0){
            return 1;
        }

        int noOfDigits = 0;

        while (number > 0){
            number = number / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }

    public int getSumOfDigits(int number) {
        // Write your code here
        if(number < 0){
            return -1;
        }

        if (number == 0){
            return 0;
        }

        int sumOfDigits = 0;

        while (number > 0){
            int digit = number % 10;
            sumOfDigits += digit;
            number = number/10;
        }
        return sumOfDigits;
    }

    /**
     * This method reverses a given integer and returns the reversed number.
     * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
     * If the number is zero, it returns 0 as the reverse of 0 is 0.
     * @param number: an integer
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
    public int reverseNumber(int number) {
        // TODO: Write your code here
        if(number < 0){
            return -1;
        }

        if (number == 0){
            return 0;
        }

        int reverseNumber = 0;

        while (number > 0){
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number/10;
            System.out.format("digit-%d number-%d reverseNumber-%d", digit, number,
                    reverseNumber).println();
        }
        return reverseNumber;
    }
}
