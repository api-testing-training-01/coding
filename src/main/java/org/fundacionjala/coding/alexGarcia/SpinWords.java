package org.fundacionjala.coding.alexGarcia;

import java.util.ArrayList;

public final class SpinWords {
    private static final int NUMBER_OF_LETTERS = 4;

    private SpinWords() {

    }

    public static String invert(final String input) {
        ArrayList<String> newSentence = new ArrayList<String>();
        String[] wordList = input.split(" ");

        for (String word : wordList) {
            if (word.length() > NUMBER_OF_LETTERS) {
                StringBuilder spinWord = new StringBuilder(word);
                newSentence.add(spinWord.reverse().toString());
            } else {
                newSentence.add(word);
            }
        }
        return String.join(" ", newSentence);
    }
}
