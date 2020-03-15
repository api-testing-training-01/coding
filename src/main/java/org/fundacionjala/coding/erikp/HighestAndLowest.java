package org.fundacionjala.coding.erikp;

import java.util.Comparator;
import java.util.List;

public class HighestAndLowest {
    private static Integer actualHigh;
    private static Integer actualLow;

    public static Integer high(List<Integer> input) {
        return actualHigh = input.stream().max(Comparator.naturalOrder()).get();
    }

    public static Integer low(List<Integer> input) {
        return actualLow = input.stream().min(Comparator.naturalOrder()).get();
    }
}