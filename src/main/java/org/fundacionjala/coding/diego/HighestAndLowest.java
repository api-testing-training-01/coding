package org.fundacionjala.coding.diego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class HighestAndLowest {
    private HighestAndLowest() {

    }

    public static String highAndLow(final String inputHighAndLowNumber) {
        String[] characters = inputHighAndLowNumber.split("\\s");
        List<Integer> newNumbers = new ArrayList<>();
        Arrays.stream(characters).forEach(c -> newNumbers.add(Integer.valueOf(c)));
        Collections.sort(newNumbers);
        return newNumbers.get(newNumbers.size() - 1) + " " + newNumbers.get(0);
    }
}
