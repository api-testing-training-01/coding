package org.fundacionjala.erikp;

public final class SpinWords {

    private static final int LIMIT_SIZE = 5;

    private SpinWords() {

    }

    public static String invert(final String input) {
        String[] words = input.split(" ");
        StringBuilder inputString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= LIMIT_SIZE) {
                StringBuilder builder = new StringBuilder(words[i]);
                words[i] = builder.reverse().toString();
            }
            inputString.append(words[i]).append(" ");
        }
        return inputString.toString().trim();
    }
}
