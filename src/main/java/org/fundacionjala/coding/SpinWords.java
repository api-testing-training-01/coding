package org.fundacionjala.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Codewars exercise 1.
 */
public class SpinWords {
    /**
     * spinWords return a sentence with phrases in reverse order when word length > 5.
     * @param  sentence  the string that contains sentences
     * @return String
     */
    public String spinWords(final String sentence) {
        //Streaming string to filter by length to apply reverse
        final int limitLength = 5;
       List<String> sentenceArray = Arrays.asList(sentence.split(" "));
       List<String> resultArray = new ArrayList<>();
       sentenceArray.stream()
                .forEach(word -> {
                    if (word.length() > limitLength) {
                        word = reverse(word);
                    }
                    resultArray.add(word);
                });

        String result = resultArray.stream().collect(Collectors.joining(" "));
        return result;
    }

    private String reverse(final String word5) {
        StringBuilder res = new StringBuilder(word5);

        int i = 0, j = word5.length() - 1;
        while (i < j) {
            while ((i < j) && (!Character.isLetter(word5.charAt(i)))) {
                i++;
            }
            while ((i < j) && (!Character.isLetter(word5.charAt(j)))) {
                j--;
            }
            char tmp = word5.charAt(i);
            res.setCharAt(i, word5.charAt(j));
            res.setCharAt(j, tmp);
            i++;
            j--;
        }
        return String.valueOf(res);
    }
}
