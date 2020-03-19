package org.fundacionjala.coding.franzVidangos;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class RemoveDuplicateWords {

    private RemoveDuplicateWords() {
    }

    public static String removeWords(final String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}
