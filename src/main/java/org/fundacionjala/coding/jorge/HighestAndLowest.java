package org.fundacionjala.coding.jorge;

import java.util.Arrays;
import java.util.Comparator;

public final class HighestAndLowest {

    private HighestAndLowest() {
    }

    public static String findHighestAndLowest(final String text) {
        String[] numbers = text.split(" ");
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(final String s, final String t1) {
                return Integer.valueOf(s).compareTo(Integer.valueOf(t1));
            }
        });
        return numbers[numbers.length - 1] + " " + numbers[0];
    }

}
