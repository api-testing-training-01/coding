package org.fundacionjala.coding.jacky;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class RemoveDuplicateWords {
    private RemoveDuplicateWords() {
    }
    public static String removeWords(final String sentence) {
        return Arrays.stream(sentence.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}
