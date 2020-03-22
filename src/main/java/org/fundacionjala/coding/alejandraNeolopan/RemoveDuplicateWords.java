package org.fundacionjala.coding.alejandraNeolopan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicateWords {
    public String removeDuplicateWords(final String s) {
        List<String> words = Arrays.asList(s.split(" "));
        List<String> resultArray = new ArrayList<>();
        words.forEach(word -> {
            if (Collections.frequency(resultArray, word) == 0) {
                resultArray.add(word);
            }
            });
        return String.join(" ", resultArray);

    }
}
