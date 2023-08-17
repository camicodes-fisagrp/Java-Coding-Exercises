package com.javacodingexercises.set8;

import java.util.Arrays;
public class StringMagic {
    public boolean areAnagrams(String str1, String str2) {
        // Write your code here
        if (str1 == null || str2 == null){
            return false;
        }

        if (str1.length() != str2.length()){
            return false;
        }

        String lowercaseStr1 = str1.toLowerCase();
        String lowercaseStr2 = str2.toLowerCase();

        char[] charArray1 = lowercaseStr1.toCharArray();
        char[] charArray2 = lowercaseStr2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if (sentence == null){
            return "INVALID";
        }
        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if (sentence.equals("")){
            return "";
        }
        // TODO: Split the sentence into words using the split method.
        // Use " " as the delimiter to match space.
        // TODO: Create a StringBuilder to hold the reversed sentence.
        // TODO: Loop through each word in the words array.
        // TODO: For each word, create a StringBuilder and reverse the word.
        // Append the reversed word, followed by a space, to the reversed sentence.
        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        StringBuilder reversedSentence = new StringBuilder();

        for (String word: sentence.split(" ")){
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}