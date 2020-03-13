package org.fundacionjala.coding.jorge;

public final class SpinWords {
    private static final int WORD_LENGTH = 4;

    private SpinWords() {

    }

    public static String convertToSpin(final String text) {
        String[] splitText = text.split(" ");
        String spinResult = "";

        for (int i = 0; i < splitText.length; i++) {
            String word = splitText[i];
            if (!word.isEmpty() && word.length() > WORD_LENGTH) {
                spinResult += new StringBuilder(word).reverse().toString();
                spinResult += " ";
            } else {
                spinResult += word;
                spinResult += " ";
            }
        }

        return spinResult.substring(0, spinResult.length() - 1);
    }
}
