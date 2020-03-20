package org.fundacionjala.coding.alexGarcia;

import java.util.LinkedHashSet;
import java.util.Set;

public final class RemoveWords {
    private RemoveWords() { }

    public static String removeDuplicateWords(final String words) {
        String[] wordsList = words.split(" ");
        Set<String> set = new LinkedHashSet<String>();
        for (String word : wordsList) {
            set.add(word);
        }
        return String.join(" ", set);
    }
}
