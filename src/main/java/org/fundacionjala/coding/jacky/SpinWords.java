package org.fundacionjala.coding.jacky;

public class SpinWords {
    public String spinWords(final String sentence) {
        StringBuilder reverseString = new StringBuilder();
        String[] words = sentence.split(" ");
        final int sizeWord = 4;
        for (String word : words) {
            if (word.length() > sizeWord) {
                String reverseWord = new StringBuilder(word).reverse().toString();
                reverseString.append(reverseWord + " ");
            } else {
                reverseString.append(word + " ");
            }
        }
        return reverseString.toString().trim();
    }
}
