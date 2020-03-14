package org.fundacionjala.coding.jacky;

import java.util.Arrays;

public final class HighestAndLowest {

    private HighestAndLowest() {
        //not called
    }
    public static String highAndLow(final String numbers) {
        String[] arrayNumbers = numbers.split(" ");
        int[] intNumbers = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            intNumbers[i] = Integer.parseInt(arrayNumbers[i]);
        }
        Arrays.sort(intNumbers);
        return intNumbers[intNumbers.length - 1] + " " + intNumbers[0];
    }
}
