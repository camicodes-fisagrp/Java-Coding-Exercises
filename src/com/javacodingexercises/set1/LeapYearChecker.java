package com.javacodingexercises.set1;

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year < 1){
            return false;
        }
        if (year % 4 != 0){
            return false;
        }
        if (year % 100 != 0){
            return true;
        }
        if (year % 400 != 0){
            return false;
        }
        return true;
    }
}
