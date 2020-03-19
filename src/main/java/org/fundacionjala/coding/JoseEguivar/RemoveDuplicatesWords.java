package org.fundacionjala.coding.JoseEguivar;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class RemoveDuplicatesWords {

    private RemoveDuplicatesWords() {

    }

    public static String removeDuplicateWords(final String s) {
        String[] array = s.split("\\s+");
        return Arrays.stream(array).distinct().collect(Collectors.joining(" "));
    }
}
