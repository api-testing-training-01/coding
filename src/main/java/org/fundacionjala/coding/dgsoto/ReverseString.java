package org.fundacionjala.coding.dgsoto;

public final class ReverseString {

    private static final int NUMBER = 5;

    private ReverseString() {

    }

    public static String invertString(final String sentence) {
        if (sentence.isEmpty() || sentence.trim().length() < 1) {
            return null;
        } else {
            String[] words = sentence.split(" ");
            String reverseString = "";
            for (int index = 0; index < words.length; index++) {
                String word = words[index];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    if (word.length() >= NUMBER) {
                        reverseWord = reverseWord + word.charAt(j);
                    } else {
                        reverseWord = word;
                    }
                }
                reverseString = reverseString + reverseWord + " ";
            }
            return reverseString.substring(0, reverseString.length() - 1);
        }
    }
}
