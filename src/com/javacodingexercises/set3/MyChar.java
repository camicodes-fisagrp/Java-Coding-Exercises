package com.javacodingexercises.set3;

public class MyChar {
    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
            // TODO: Complete the switch statement
            case 'a', 'e', 'i', 'o', 'u':
            case 'A', 'E', 'I', 'O', 'U': return true;

            default: return false;
        }
    }
}
