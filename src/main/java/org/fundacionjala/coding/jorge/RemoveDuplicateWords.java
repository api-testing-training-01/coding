package org.fundacionjala.coding.jorge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class RemoveDuplicateWords {

    private RemoveDuplicateWords() {

    }

    public static String removeDuplicate(final String text) {
        Stream<String> words = Arrays.stream(text.split(" "));
        List<String> res = words.distinct().collect(Collectors.toList());
        StringBuilder wordsResult = new StringBuilder();

        for (int i = 0; i < res.size(); i++) {
            wordsResult.append(res.get(i)).append(" ");
        }
        return wordsResult.toString().trim();
    }
}
