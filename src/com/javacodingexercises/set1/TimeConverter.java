package com.javacodingexercises.set1;
public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if(hours < 0){
            return -1;
        }
        return hours * 60;
    }
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if(days < 0){
            return -1;
        }
        return days * 24 * 60;
    }
}
