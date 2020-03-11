package org.fundacionjala.coding.jacky;

public class SpinWords {
    public String spinWords(String sentence){
        StringBuilder reverseString = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (word.length()>4){
                String reverseWord = new StringBuilder(word).reverse().toString();
                reverseString.append(reverseWord + " ");
            }
            else {
                reverseString.append(word + " ");
            }
        }
        return reverseString.toString().trim();
    }
}
