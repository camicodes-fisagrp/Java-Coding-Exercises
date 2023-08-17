package com.javacodingexercises.set5;

public class StringMagic {
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        if(str == null){
            return -1;
        }

        int count = 0;

        for (int i = 0; i<str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        // TODO: Write your code here
        for (int i = 0; i < str.length()-1; i++){
            char currentCharacter = str.charAt(i);
            char nextCharacter = str.charAt(i+1);

            if(currentCharacter == nextCharacter){
                return true;
            }
        }
        return false;
    }

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {
        // TODO: Write your code here
        if (str == null || str.equals("")){
            return -1;
        }

        int length = str.length();
        for (int i = length-1; i >= 0; i--){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                return Character.getNumericValue(ch);
            }
        }
        return -1;
    }

    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {
        // TODO: Write your code here
        if (sentence == null || sentence.equals("")){
            return "";
        }

        String[] words = sentence.split(" ");

        int maxLength = 0;
        String longestWord = "";

        for (String word: words){
            if(word.length() > maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
}
