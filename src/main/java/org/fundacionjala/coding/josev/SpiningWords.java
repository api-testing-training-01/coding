package org.fundacionjala.coding.josev;

public final class SpiningWords {

    private static final int NUMBER = 5;

    private SpiningWords() {

    }

    public static String spiningWordsInString(final String sentence) {
        if (sentence.trim().length() < 1) {
            return null;
        } else {
            String[] texts = sentence.split(" ");
            String sentenceString = "";
            int counter = 0;
            while (counter < texts.length) {
                String text = texts[counter];
                String inverText = "";
                int index = text.length() - 1;
                while (index >= 0) {
                    if (text.length() >= NUMBER) {
                        inverText = inverText + text.charAt(index);
                    } else {
                        inverText = text;
                    }
                    index = index - 1;
                }
                sentenceString = sentenceString + inverText + " ";
                counter = counter + 1;
            }
            return sentenceString.substring(0, sentenceString.length() - 1);
        }
    }
}
