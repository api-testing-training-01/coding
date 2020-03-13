package org.fundacionjala.coding.alexGarcia;

public final class HighestAndLowest {
    private HighestAndLowest() {

    }

    public static String highAndLow(final String input) {
        boolean emptyNumber = true;
        int highNumber = 0;
        int lowNumber = 0;
        String[] numberList = input.split(" ");
        for (String number : numberList) {
            int numberInt = Integer.parseInt(number);
            // Additional validation: add value to highNumber and low number
            if (emptyNumber) {
                highNumber = numberInt;
                lowNumber = numberInt;
                emptyNumber = false;
            }
            // Verify high number
            if (numberInt > highNumber) {
                highNumber = numberInt;
            }
            // Verify low number
            if (numberInt < lowNumber) {
                lowNumber = numberInt;
            }
        }
        return highNumber + " " + lowNumber;
    }
}
