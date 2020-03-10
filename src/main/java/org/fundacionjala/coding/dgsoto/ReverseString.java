package org.fundacionjala.coding.dgsoto;

public final class ReverseString {

    private ReverseString() {

    }

    public static String invertString(final String sentence) {
        String[] words = sentence.split("[\\s]");
        StringBuilder invertedString = new StringBuilder();
        for (int index = 0; index < words.length; index++) {
            invertedString.append(words[index].length() >= 1 ? reverseString(words[index]) : words[index]);
            if (index < words.length - 1) {
                invertedString.append(" ");
            }
        }
        return invertedString.toString();
    }

    private static String reverseString(final String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }
}
