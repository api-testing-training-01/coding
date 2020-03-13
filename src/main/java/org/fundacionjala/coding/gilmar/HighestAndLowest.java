package org.fundacionjala.coding.gilmar;

import java.util.StringTokenizer;

public final class HighestAndLowest {
    private HighestAndLowest() {

    }

    public static boolean inputIsEmpty(final String input) {
        boolean isEmpty = false;
        if (!input.equals("")) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public static boolean stringHasOnlySpaces(final String input) {
        boolean b = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                b = false;
            }
        }
        return b;
    }

    public static String resultHighestAndLowest(final String input) {

        int major;
        int minor;
        String[] compare = input.split(" ");
        major = Integer.parseInt(compare[0]);
        minor = Integer.parseInt(compare[0]);
        for (String actual : compare) {
            if (major < Integer.parseInt(actual)) {
                major = Integer.parseInt(actual);
            }

            if (minor > Integer.parseInt(actual)) {
                minor = Integer.parseInt(actual);
            }

        }

        String result = Integer.toString(major) + " " + Integer.toString(minor);

        return result;

    }

    public static int countResult(final String result) {
        StringTokenizer st = new StringTokenizer(result);
        int counter = st.countTokens();

        return counter;
    }

    public static boolean resultHasSpace(final String result) {
        boolean hasSpace = false;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == ' ') {
                hasSpace = true;
            }
        }

        return hasSpace;
    }

    public static boolean firstResultIsHighest(final String result) {
        boolean isHighest = false;
        String[] compare = result.split(" ");
        if (Integer.parseInt(compare[0]) >= Integer.parseInt(compare[1])) {
            isHighest = true;
        }

        return isHighest;
    }
}
