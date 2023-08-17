package com.javacodingexercises.set8;

public class MyString {
    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        return ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'));
    }

    public boolean isHexadecimal() {
        // Write your code here
        if(str == null || str.equals("")){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(!isHexadecimalChar(ch) && !Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
