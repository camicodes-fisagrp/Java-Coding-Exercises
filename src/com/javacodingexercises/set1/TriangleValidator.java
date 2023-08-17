package com.javacodingexercises.set1;

public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code
        if(angle1<=0 || angle2<=0 || angle3<=0){
            return false;
        }

        int sumOfAngles = angle1 + angle2 + angle3;

        return sumOfAngles == 180;
    }
    public boolean isRightAngled(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }
        if (side1 * side1 == side2 * side2 + side3 * side3) {
            return true;
        }
        if (side2 * side2 == side1 * side1 + side3 * side3) {
            return true;
        }
        if (side3 * side3 == side1 * side1 + side2 * side2) {
            return true;
        }
        return false;
    }
}
