package org.fundacionjala.coding.diego;

import java.util.Arrays;
import java.util.LinkedHashSet;

public final class RemoveDuplicateWords {

    private RemoveDuplicateWords() {

    }

    public static String removeDuplicateWords(final String sentence) {
        String[] strWords = sentence.split("\\s+");
        LinkedHashSet<String> words = new LinkedHashSet<String>(Arrays.asList(strWords));
        StringBuilder sentenceTemporal = new StringBuilder();
        int index = 0;
        for (String word : words) {
            if (index > 0) {
                sentenceTemporal.append(" ");
            }
            sentenceTemporal.append(word);
            index++;
        }
        return sentenceTemporal.toString();
    }
}
